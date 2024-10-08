import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GameService {
  
  url: String = 'http://localhost:8080/gamecatalog/'

  // httpOptions = new HttpHeaders({
  //   'Content-Type' : 'application/json',
  //   'Access-Control-Allow-Origin': '*'
  // })

  constructor(private http: HttpClient) { }

  getAllGames(){
    let dataUrl = this.url + 'all';

    return this.http.get<any>(dataUrl)
  }
}
