import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';
import { Patient } from '../model/patient';

@Component({
  selector: 'app-view-patients',
  templateUrl: './view-patients.component.html',
  styleUrls: ['./view-patients.component.css']
})
export class ViewPatientsComponent implements OnInit {
  patients: Observable<Patient[]>;
  constructor(private router: Router, private adminService: AdminService) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    debugger
    this.patients = this.adminService.getPatientsList();
  }
}
