import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';
import {IRecruitmentDto} from '../dto/i-recruitment-dto';
import {Observable} from 'rxjs';
import {IRecruitmentPageDto} from '../dto/i-recruitment-page-dto';

@Injectable({
  providedIn: 'root'
})
export class RecruitmentService {

  constructor(private httpClient: HttpClient) {
  }

  listRecruitment(): Observable<any> {
    const URL = environment.api_url + 'recruitment/hot';
    return this.httpClient.get<Array<IRecruitmentPageDto>>(URL);
  }

  listRecruitmentNew(): Observable<any> {
    const URL = environment.api_url + 'recruitment/new';
    return this.httpClient.get<Array<IRecruitmentPageDto>>(URL);
  }

  detailRecruitment(id: number): Observable<any> {
    const URL = environment.api_url + 'recruitment/detail/' + id;
    return this.httpClient.get<IRecruitmentDto>(URL);
  }

  listRecruitmentSearch(titleSearch: string | null, nameCompany: string | null): Observable<any> {
    const URL = environment.api_url + 'recruitment?titleSearch=' + titleSearch + '&nameCompany=' + nameCompany;
    return this.httpClient.get<Array<IRecruitmentPageDto>>(URL);
  }
}
