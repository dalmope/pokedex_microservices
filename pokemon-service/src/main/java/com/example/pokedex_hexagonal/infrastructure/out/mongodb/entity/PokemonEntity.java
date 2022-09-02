package com.example.pokedex_hexagonal.infrastructure.out.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PokemonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long number;
    private String name;
    private Long typeId;
    private String photoId;
}