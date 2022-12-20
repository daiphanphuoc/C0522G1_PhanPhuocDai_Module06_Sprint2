import { Component, OnInit } from '@angular/core';
import {BehaviorSubject, Observable} from 'rxjs';
import {IRecruitmentDto} from '../../dto/i-recruitment-dto';
import {IRecruitmentPageDto} from '../../dto/i-recruitment-page-dto';
import {HttpClient} from '@angular/common/http';
import {RecruitmentService} from '../../service/recruitment.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  recruitmentPage$: Observable<Array<IRecruitmentPageDto>>;

  constructor(private http: HttpClient,
              private recruitmentService: RecruitmentService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.recruitmentService.listRecruitment().subscribe(value => {
      console.log(value);
      this.recruitmentPage$ = new BehaviorSubject(value.content);
    });
  }
  search() {

  }
}
