import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Donor } from '../model/donor';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  donors: Observable<Donor[]>;
  title = 'Blood Management System';
  constructor(private routes: Router, private adminService: AdminService) {
   }

  ngOnInit() {
  }
  // viewPatient() {
  //   this.routes.navigate(['/menu/patientList']);
  // }

}
