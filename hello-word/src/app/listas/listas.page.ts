import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listas',
  templateUrl: './listas.page.html',
  styleUrls: ['./listas.page.scss'],
})
export class ListasPage implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  goToPageLondrina(){
    this.router.navigate(['/londrina']);
  }
}
