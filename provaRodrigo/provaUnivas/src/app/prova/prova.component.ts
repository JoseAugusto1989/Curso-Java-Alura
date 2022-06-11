import { Campeonato } from './campeonato.component';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-prova',
  templateUrl: './prova.component.html',
  styleUrls: ['./prova.component.scss']
})
export class ProvaComponent implements OnInit {

  constructor() { }

  newCamp: Campeonato = {} as Campeonato;
  campList: Campeonato[] = [];

  saveData(form: NgForm) {
    this.campList.push(this.newCamp);
    this.newCamp = {} as Campeonato;
    form.resetForm();
  }

  pont(): void {

  }

  ngOnInit(): void {
  }

}
