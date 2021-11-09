import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Tour} from '../entity/tour';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TourServiceService {

  constructor(private httpClient: HttpClient) { }

  create(tour: Tour): Observable<Tour|any> {
    return this.httpClient.post('http://localhost:8080/api/tour/create', tour);
  }
  list(): Observable<Tour|any> {
    return this.httpClient.get('http://localhost:8080/api/tour/list');
  }
}
