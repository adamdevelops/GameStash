import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  example_games: any = [
    {title: "Prince of Persia", console_owned_on: "PS2", date_purchased: "8/14/24", gameOwned: true},
    {title: "Prince of Persia: Warrior Within", console_owned_on: "PS2", date_purchased: "8/14/24", gameOwned: true},
    {title: "Sly Cooper", console_owned_on: "PS2", date_purchased: "8/14/24", gameOwned: true},
  ]

  console_list: any = [
    {name: "PS5", date_released: "2050"},
    {name: "Xbox", date_released: "2050"},
    {name: "Steam", date_released: "2050"},
  ]

}
