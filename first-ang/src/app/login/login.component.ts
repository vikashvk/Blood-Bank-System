import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Admin } from '../model/admin';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;

  admin: Admin = new Admin();
  constructor(private formBuilder: FormBuilder, private router: Router, private AdminServiceuter: AdminService) { }

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      adminName: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  onSubmit() {
    debugger
    if (this.loginForm.invalid == true) {
      console.log('invalid')
      return;
    }
    this.AdminServiceuter.login(this.loginForm.controls.adminName.value, this.loginForm.controls.password.value)
      .subscribe(response => {
        debugger
        if (response) {
          this.router.navigate(['/menu']);
        } else {
          alert('wrong user');
          this.loginForm.reset();
        }
      });
  }
}
