package co.com.dalmope.model.pokemon.gateways;

import co.com.dalmope.model.pokemon.Pokemon;

import java.util.List;

public interface IPokemonService {
    List<Pokemon> findAll();
    Pokemon findById(Long id);
    Pokemon save(Pokemon pokemon);
    void delete(Pokemon pokemon);
    Pokemon update(Pokemon pokemon);
    Pokemon findPokemonByName(String name);
}
