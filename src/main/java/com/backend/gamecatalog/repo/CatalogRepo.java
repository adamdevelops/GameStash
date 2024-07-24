package com.backend.gamecatalog.repo;

import com.backend.gamecatalog.model.GameCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatalogRepo extends JpaRepository<GameCatalog, Integer> {
    List<GameCatalog> findByTitleContainingIgnoreCase(String title);

//    List<GameCatalog> findByGame_owned(Boolean game_owned);

    void deleteById(Integer gameId);
}
