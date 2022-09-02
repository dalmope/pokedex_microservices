package com.example.pokedex_hexagonal.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhotoRequest {
    private Long number;
    private String name;
    private String photo;
}