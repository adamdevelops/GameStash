package com.backend.gamecatalog.repo;

import com.backend.gamecatalog.model.GameCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepo extends JpaRepository<GameCatalog, Integer> {
}
