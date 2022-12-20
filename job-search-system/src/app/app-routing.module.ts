import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './compoment/home/home.component';
import {LoginComponent} from './compoment/login/login.component';
import {DetailRecruitmentComponent} from './compoment/detail-recruitment/detail-recruitment.component';


const routes: Routes = [
  {path: 'index', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'detail/:id', component: DetailRecruitmentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
