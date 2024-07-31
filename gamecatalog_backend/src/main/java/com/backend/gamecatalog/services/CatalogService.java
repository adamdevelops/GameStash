package com.backend.gamecatalog.services;

import com.backend.gamecatalog.model.GameCatalog;
import com.backend.gamecatalog.repo.CatalogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogRepo catalogRepo;

    public List<GameCatalog> findAllGames(){return catalogRepo.findAll(); }

    public List<GameCatalog> findByTitle(String title){return catalogRepo.findByTitleContainingIgnoreCase(title); }

    public List<GameCatalog> findByIfOwned(Boolean gameOwned){return catalogRepo.findByGameOwned(gameOwned); }

    public GameCatalog saveNewGame(GameCatalog game){return catalogRepo.save(game);}

    public void deleteExistingGame(Integer gameId){catalogRepo.deleteById(gameId);}
}
