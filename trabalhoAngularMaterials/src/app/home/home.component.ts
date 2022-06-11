import { Campeonato } from './../campeonato';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  campeonato: Campeonato[] = [];
  displayedColumns = ['nome', 'estado', 'voto'];

  constructor() { }

  ngOnInit(): void {
  }

}
