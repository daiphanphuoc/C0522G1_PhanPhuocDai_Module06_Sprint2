import {Component, OnInit} from '@angular/core';
import {Title} from '@angular/platform-browser';
import {ActivatedRoute, Router} from '@angular/router';
import {RecruitmentService} from '../../service/recruitment.service';
import {IRecruitmentDto} from '../../dto/i-recruitment-dto';

@Component({
  selector: 'app-detail-recruitment',
  templateUrl: './detail-recruitment.component.html',
  styleUrls: ['./detail-recruitment.component.css']
})
export class DetailRecruitmentComponent implements OnInit {

  detail: IRecruitmentDto;

  constructor(private title: Title,
              private activatedRoute: ActivatedRoute,
              private recruitmentService: RecruitmentService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getDetail();
  }

  getDetail() {
    const id = Number(this.activatedRoute.snapshot.params.id);
    this.recruitmentService.detailRecruitment(id).subscribe(value => {
      console.log(value);
      this.detail = value;
    });
  }

}
