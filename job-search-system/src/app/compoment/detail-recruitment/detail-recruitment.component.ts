import {Component, OnInit} from '@angular/core';
import {Title} from '@angular/platform-browser';
import {ActivatedRoute, Router} from '@angular/router';
import {RecruitmentService} from '../../service/recruitment.service';
import {IRecruitmentDto} from '../../dto/i-recruitment-dto';
import {render} from 'creditcardpayments/creditCardPayments';
import {log} from 'util';
import Swal from 'sweetalert2';
import {TokenStorageService} from '../../service/login/token-storage.service';

@Component({
  selector: 'app-detail-recruitment',
  templateUrl: './detail-recruitment.component.html',
  styleUrls: ['./detail-recruitment.component.css']
})
export class DetailRecruitmentComponent implements OnInit {

  detail: IRecruitmentDto;
  username = '';

  constructor(private title: Title,
              private activatedRoute: ActivatedRoute,
              private recruitmentService: RecruitmentService,
              private tokenService: TokenStorageService,
              private router: Router) {
    if(this.tokenService.getUser()!=null){
      this.username = this.tokenService.getUser().username;
    }

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

  payment() {
    render({
      id: '#myPaypal',
      value: '2',
      currency: 'USD',
      onApprove: (details) => {
        Swal.fire({
          position: 'center',
          icon: 'success',
          text: 'Cảm ơn quý khách !',
          title: 'Đã thanh toán thành công',
          showConfirmButton: false,
        });
        // this.action = true;
        // this.confirmUpdate();
        window.location.replace('index');
        // this.router.navigateByUrl('index');
      }

    });
  }

}
