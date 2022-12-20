import {Component, OnInit} from '@angular/core';
import {BehaviorSubject, Observable} from 'rxjs';
import {IRecruitmentDto} from '../../dto/i-recruitment-dto';
import {IRecruitmentPageDto} from '../../dto/i-recruitment-page-dto';
import {HttpClient} from '@angular/common/http';
import {RecruitmentService} from '../../service/recruitment.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  recruitmentPage$: Observable<Array<IRecruitmentPageDto>>;
  recruitmentPageSearch$: Observable<Array<IRecruitmentPageDto>>;
  recruitmentPageNew$: Observable<Array<IRecruitmentPageDto>>;
  formSearch: FormGroup;

  isSearch: boolean;

  constructor(private http: HttpClient,
              private recruitmentService: RecruitmentService,
              private formBuild: FormBuilder) {
    this.formSearch = this.formBuild.group({
        titleSearch: ['', Validators.required],
        nameCompany: ['', Validators.required]

      }
    );
    this.isSearch = false;
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.recruitmentService.listRecruitmentNew().subscribe(value => {
      console.log(value);
      this.recruitmentPageNew$ = new BehaviorSubject(value.content);
    });
    this.recruitmentService.listRecruitment().subscribe(value => {
      console.log(value);
      this.recruitmentPage$ = new BehaviorSubject(value.content);
    });
  }

  search() {
    this.isSearch = true;
    this.recruitmentService.listRecruitmentSearch(this.formSearch.value.titleSearch, this.formSearch.value.nameCompany).subscribe(value => {
      console.log(value);
      this.recruitmentPageSearch$ = new BehaviorSubject(value.content);
    });
  }
}
