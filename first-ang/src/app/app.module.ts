import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule  } from '@angular/common/http';

import { AdminService } from './admin.service';
import { AddPatientComponent } from './add-patient/add-patient.component';
import { ViewPatientsComponent } from './view-patients/view-patients.component';
import { ViewDonorsComponent } from './view-donors/view-donors.component';
import { AllDonorsComponent } from './all-donors/all-donors.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';

// const routes: Routes = [
//   { path: '', pathMatch: 'full', redirectTo: '/login' },
//   { path: 'login', component: LoginComponent },
//   { path: 'menu', component: MenuComponent}
// ];
@NgModule({
  declarations: [LoginComponent, AppComponent, MenuComponent, AddPatientComponent, ViewPatientsComponent, ViewDonorsComponent, AllDonorsComponent, FooterComponent, HeaderComponent ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    // RouterModule.forRoot(routes),
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule

  ],
  bootstrap: [AppComponent],
  providers: [AdminService,
    ]
})

export class AppModule { }
