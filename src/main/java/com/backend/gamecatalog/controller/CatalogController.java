package com.backend.gamecatalog.controller;

import com.backend.gamecatalog.model.GameCatalog;
import com.backend.gamecatalog.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gamecatalog")
public class CatalogController {

    @Autowired
    CatalogService catalogService;

    @GetMapping("/all")
    public ResponseEntity<List<GameCatalog>> getAllGames(){
        List<GameCatalog> games = catalogService.findAllGames();
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
}
