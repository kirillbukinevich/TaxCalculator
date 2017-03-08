import { Component, OnInit } from '@angular/core';
import {TranslateService} from '@ngx-translate/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {


  public languages = [
    {value: 'en', display: 'английский'},
    {value: 'ru', display: 'русский'},
  ];


  translate: TranslateService;

  constructor(translate: TranslateService) {
    this.translate = translate;
    // this language will be used as a fallback when a translation isn't found in the current language
    this.translate.setDefaultLang('en');

    // the lang to use, if the lang isn't available, it will use the current loader to get them
    this.translate.use('en');
  }

  ngOnInit() {
  }

  changeLanguage(language){
    console.log(language);
    this.translate.use(language);
  }


}
