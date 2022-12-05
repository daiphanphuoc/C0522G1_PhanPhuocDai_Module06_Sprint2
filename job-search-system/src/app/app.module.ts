import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HeadComponent } from './head/head.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { DetailRecruitmentComponent } from './detail-recruitment/detail-recruitment.component';
import { BoxSearchJobComponent } from './box-search-job/box-search-job.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeadComponent,
    FooterComponent,
    NavbarComponent,
    HomeComponent,
    DetailRecruitmentComponent,
    BoxSearchJobComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
