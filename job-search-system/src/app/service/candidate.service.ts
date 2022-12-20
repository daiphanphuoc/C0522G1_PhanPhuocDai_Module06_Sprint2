import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';
import {IRecruitmentPageDto} from '../dto/i-recruitment-page-dto';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CandidateService {

  constructor(private httpClient: HttpClient) { }


  getIdCandidate(username: string): Observable<number> {
    const URL = environment.api_url + 'candidate/' + username ;
    return this.httpClient.get<number>(URL);
  }
}
