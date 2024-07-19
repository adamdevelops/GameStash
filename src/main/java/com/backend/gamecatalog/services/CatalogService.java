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
}
