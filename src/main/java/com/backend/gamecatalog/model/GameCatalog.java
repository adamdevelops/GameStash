package com.backend.gamecatalog.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "game_catalog")
public class GameCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String console_owned_on;
    private String consoles;
    private String date_purchased;
    private boolean game_owned;

}
