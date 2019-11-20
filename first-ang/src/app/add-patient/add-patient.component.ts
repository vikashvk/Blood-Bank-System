import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from '../model/patient';
import { AdminService } from '../admin.service';
import { HospitalLocation } from '../model/hospital-location';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-patient',
  templateUrl: './add-patient.component.html',
  styleUrls: ['./add-patient.component.css']
})
export class AddPatientComponent implements OnInit {
  patient: Patient = new Patient();
  hospitalLocation: HospitalLocation = new HospitalLocation();
  submitted = false;
  bloodGroup: string;
  // addForm: FormGroup;

  constructor(private router: Router, private adminService: AdminService) { }

  ngOnInit() {
    // this.addForm = this.formBuilder.group({
    //   patientId: ['', Validators.required],
    //   patientName: ['', Validators.required],
    //   emailId: ['', Validators.required],
    //   bloodGroup: ['', Validators.required],
    //   phoneNum: ['', Validators.required]
    // });
  }

  newPatient(): void {
    this.submitted = false;
    this.patient = new Patient();
  }

  save() {
    console.log(this.patient);
    this.adminService.createPatient(this.patient)
      .subscribe(data => console.log(data), error => console.log(error));
    this.bloodGroup = this.patient.bloodGroup;
    this.gotoList(this.bloodGroup);
  }

  onSubmit() {
    // if (this.addForm.invalid == true) {
    //   console.log('invalid');
    //   return;
    // }
    this.submitted = true;
    this.save();
  }

  gotoList(bloodGroup: string) {
    console.log(bloodGroup);
    this.router.navigate(['donorsList' , bloodGroup]);
  }
}
