import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
import { Patient } from '../model/patient';
import { Donor } from '../model/donor';

@Component({
  selector: 'app-view-donors',
  templateUrl: './view-donors.component.html',
  styleUrls: ['./view-donors.component.css']
})
export class ViewDonorsComponent implements OnInit {
  bloodGroup: string;
  donors: any;
  patient: Patient;

  constructor(private router: ActivatedRoute, private adminService: AdminService) { }

  ngOnInit() {
    this.bloodGroup = this.router.snapshot.params['bloodGroup'];
    console.log(this.bloodGroup);
    this.donors = this.adminService.getDonorList(this.bloodGroup);
}
}
