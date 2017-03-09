import {Injectable} from "@angular/core";
import {Http, Response} from "@angular/http";
import {IncomeTax} from "../interface/income-tax.interface";
import "rxjs/Rx";
import {Headers} from "@angular/http";


@Injectable()
export class HttpService {

  constructor(private http: Http) {
  }

  getData(): any {
    return this.http.get(`/personInfo`);
  }

  saveIncomeTax(incomeTax: IncomeTax) {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    this.http.post(`/personInfo`, incomeTax, headers)
      .subscribe(
        data => {
          console.log('Saved', data.json());
        },
        err => console.log('Something went wrong')
      );
  }
}
