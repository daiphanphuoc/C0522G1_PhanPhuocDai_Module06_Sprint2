import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';


import {TokenStorageService} from './token-storage.service';
import {Injectable} from '@angular/core';
import {UserDto} from '../../dto/user-dto';
import {environment} from '../../../environments/environment';
import {IUser} from '../../model/i-user';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  httpOptions: any;

  constructor(private http: HttpClient, private tokenService: TokenStorageService) {
    this.httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        Authorization: 'Bearer ' + this.tokenService.getToken()
      }),
      'Access-Control-Allow-Origin': 'http://localhost:4200',
      'Access-Control-Allow-Methods': 'GET,PUT,POST,DELETE,PATCH,OPTIONS'
    };
  }

  editUser(user: UserDto): Observable<any> {
    return this.http.patch<any>(environment.api_url + 'user/edit', user, this.httpOptions);
  }

  getAll(): Observable<IUser[]> {
    return this.http.get<IUser[]>(environment.api_url + 'public/user');
  }

  showUsername(): Observable<any> {
    return this.http.get<any>(environment.api_url + 'public/findUsername', this.httpOptions);
  }
}
