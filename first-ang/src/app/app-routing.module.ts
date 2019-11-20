import { NgModule } from '@angular/core';
import {  RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { AddPatientComponent } from './add-patient/add-patient.component';
import { ViewPatientsComponent } from './view-patients/view-patients.component';
import { ViewDonorsComponent } from './view-donors/view-donors.component';
import { AllDonorsComponent } from './all-donors/all-donors.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/login' },
  { path: 'login', component: LoginComponent },
  { path: 'menu', component: MenuComponent},
  { path: 'menu/add', component: AddPatientComponent},
  { path: 'menu/patientList', component: ViewPatientsComponent},
  { path: 'donorsList/:bloodGroup', component: ViewDonorsComponent},
  { path: 'menu/donors', component: AllDonorsComponent},
  { path: 'donors/:eMail', component: AllDonorsComponent}
];
@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
