package com.example.pokedex_hexagonal.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "image-service")
@RequestMapping("/image/")
public interface ImageClient {

    @PostMapping("/")
    ResponseEntity<Void> saveImage(@RequestBody PokedexRequest pokedexRequest);

    @GetMapping("/")
    ResponseEntity<List<PokedexResponse>> getAllPokemonFromPokedex();

    @GetMapping("/{number}")
    ResponseEntity<PokedexResponse> getPokemonFromPokedex(@PathVariable(name = "number") Long pokemonNumber);

}
