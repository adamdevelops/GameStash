package com.backend.gamecatalog.controller;

import com.backend.gamecatalog.model.GameCatalog;
import com.backend.gamecatalog.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gamecatalog")
public class CatalogController {

    @Autowired
    CatalogService catalogService;

    @RequestMapping("/all")
    public ResponseEntity<List<GameCatalog>> getAllGames(){
            List<GameCatalog> games = catalogService.findAllGames();
            return new ResponseEntity<>(games, HttpStatus.OK);
    }

    @GetMapping("/game/{title}")
    public ResponseEntity<List<GameCatalog>> getGameByTitle(@PathVariable String title){
        List<GameCatalog> games = catalogService.findByTitle(title);
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
    
    @PostMapping("/newgame")
    public ResponseEntity addGame(@RequestBody GameCatalog game){
        catalogService.saveNewGame(game);
        String resp = "New Game Added! " + game.getTitle();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
