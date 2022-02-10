import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../environments/environment';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {

  url: string = environment.apiUrl + "/gbsu-ftb-lai";

  constructor(private http: HttpClient) { }

  convertNumber(inputNumber) {
    return this.http.get<Result>(this.url + '/' + inputNumber);
  }

}
