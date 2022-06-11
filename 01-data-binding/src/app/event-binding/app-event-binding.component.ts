import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './app-event-binding.component.html',
  styleUrls: ['./app-event-binding.component.scss']
})
export class AppEventBindingComponent implements OnInit {

  valorAtual: string = '';
  valorSalvo: string = '';
  isMouseOver: boolean = false;
  name: string = 'abc';

  pessoa: any = {
    nome: 'def',
    idade: 20
  };

  clickOnButton() {
    alert('Botão clicado!!!');
  }

  onKeyUp(evento: KeyboardEvent) {
    this.valorAtual = (<HTMLInputElement>evento.target).value;
  }

  salvarValor(valor: any) {
    this.valorSalvo = valor;
  }

  mouseOutOver() {
    this.isMouseOver = !this.isMouseOver;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
