import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './compoment/login/login.component';
import { HeadComponent } from './compoment/head/head.component';
import { FooterComponent } from './compoment/footer/footer.component';
import { NavbarComponent } from './compoment/navbar/navbar.component';
import { HomeComponent } from './compoment/home/home.component';
import { DetailRecruitmentComponent } from './compoment/detail-recruitment/detail-recruitment.component';
import { BoxSearchJobComponent } from './compoment/box-search-job/box-search-job.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { TestComponent } from './compoment/test/test.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeadComponent,
    FooterComponent,
    NavbarComponent,
    HomeComponent,
    DetailRecruitmentComponent,
    BoxSearchJobComponent,
    TestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
