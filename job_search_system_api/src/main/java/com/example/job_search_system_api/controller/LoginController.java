package com.example.job_search_system_api.controller;

import com.example.job_search_system_api.common.jwt.JwtTokenUtil;
import com.example.job_search_system_api.dto.IUserDto;
import com.example.job_search_system_api.dto.LoginRequest;
import com.example.job_search_system_api.dto.LoginResponse;
import com.example.job_search_system_api.dto.MyUserDetail;
import com.example.job_search_system_api.service.IRoleService;
import com.example.job_search_system_api.service.IUserService;
import com.example.job_search_system_api.service.impl.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;


    @Autowired
    private MyUserDetailService myUserDetailService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenUtil.generateJwtToken(loginRequest.getUsername());
        MyUserDetail myUserDetails = (MyUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<String> roles = myUserDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());
        return ResponseEntity.ok(
                new LoginResponse(jwt, myUserDetails.getUsername(), roles));
    }

    @GetMapping("/findUsername")
    public ResponseEntity<?> showUsername(HttpServletRequest request) {
        String headerAuth = request.getHeader("Authorization");
        String username = jwtTokenUtil.getUsernameFromJwtToken(headerAuth.substring(7));
        IUserDto user = userService.getUser(username);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
