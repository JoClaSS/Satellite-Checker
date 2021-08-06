import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {environment} from '../environments/environment'
import { satellites } from './homepage/satellites';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomepageService {

  url: string = environment.ApiBaseUrl;

  constructor(
    private http: HttpClient
  ) { }

   save(newSatellite:satellites) : Observable<satellites> {
       return this.http.post<satellites>(this.url, newSatellite);
   }

}
