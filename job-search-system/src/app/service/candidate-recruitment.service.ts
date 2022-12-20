import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CandidateRecruitmentService {

  constructor(private httpClient: HttpClient) {
  }

  insertRecruitment(obj: { candidateId: number, recruitmentId: number}): Observable<number>{
    const URL = environment.api_url + 'candidate-recruitment/create'  ;
    return this.httpClient.post<number>(URL, obj);
  }
}
