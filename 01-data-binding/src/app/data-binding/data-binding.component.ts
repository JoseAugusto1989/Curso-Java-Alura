import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.scss']
})
export class DataBindingComponent implements OnInit {

  url: any = 'http://loiane.training';
  resultado: any = 1+1;
  cursoAngular: boolean = true;
  urlImagem1 = "http://lorempixel.com.br/500/400/?2";
  urlImagem2 = 'http://lorempixel.com.br/500/400/?1';

  getValor() {
    return 1;
  }

  getCurtirCurso() {
    return true;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
