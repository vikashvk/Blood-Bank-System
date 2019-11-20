import { Component, OnInit } from '@angular/core';
import { Donor } from '../model/donor';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-all-donors',
  templateUrl: './all-donors.component.html',
  styleUrls: ['./all-donors.component.css']
})
export class AllDonorsComponent implements OnInit {
  donors: Observable<Donor[]>;
  constructor(private router: Router, private adminService: AdminService) { }

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.donors = this.adminService.getAllDonors();
  }
  deleteDonor(eMail: string) {
    this.adminService.deleteDonor(eMail)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

}
