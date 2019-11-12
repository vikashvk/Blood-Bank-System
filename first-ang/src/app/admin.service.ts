import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxJs';
import { Donor } from './model/donor';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  private baseUrl = 'http://localhost:8082/cg/blood';

  constructor(private http: HttpClient) {
  }

  login(adminName, password): Observable<any> {
    let params = new HttpParams();
    params = params.set('adminName', adminName);
    params = params.set('password', password);
    return this.http.get(`${this.baseUrl}` + `/menu`, { params: params });
  }
  createPatient(patient: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + '/addPatient', patient);
  }
  getPatientsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + '/patientList');
  }
  getDonorList(bloodGroup: any): Observable<any> {
    return this.http.get(`${this.baseUrl}` + '/donorList/' + bloodGroup);
  }
  getAllDonors(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + '/donors');
  }

}
