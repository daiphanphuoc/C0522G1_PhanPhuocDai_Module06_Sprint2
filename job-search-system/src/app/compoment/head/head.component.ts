import {Component, OnInit} from '@angular/core';
import {IRole} from '../../model/i-role';
import {TokenStorageService} from '../../service/login/token-storage.service';

@Component({
  selector: 'app-head',
  templateUrl: './head.component.html',
  styleUrls: ['./head.component.css']
})
export class HeadComponent implements OnInit {
  username = '';
  private roles: string[] | IRole[];

  private isCustomer: boolean;
  private isEmployee: boolean;
  private isAdmin: boolean;

  constructor(private tokenService: TokenStorageService) {
  }

  ngOnInit(): void {
    this.showUsername();
  }

  showUsername() {
    this.username = this.tokenService.getUser().username;
    this.roles = this.tokenService.getUser().roles;
    this.isCustomer = this.roles.indexOf('ROLE_CUSTOMER') !== -1;
    this.isEmployee = this.roles.indexOf('ROLE_EMPLOYEE') !== -1;
    this.isAdmin = this.roles.indexOf('ROLE_ADMIN') !== -1;
  }
}
