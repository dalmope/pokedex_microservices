package co.com.dalmope.usecase.pokemon;

import co.com.dalmope.model.pokemon.Pokemon;
import co.com.dalmope.model.pokemon.gateways.IPokemonService;

import java.util.List;

public class PokemonUseCase {

    private final IPokemonService pokemonService;

    public PokemonUseCase(IPokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    public List<Pokemon> findAll() {
        return pokemonService.findAll();
    }

    public Pokemon findPokemonByName(String name) {
        return pokemonService.findPokemonByName(name);
    }

    public Pokemon findById(Long id) {
        return pokemonService.findById(id);
    }

    public Pokemon save(Pokemon pokemon) {
        return pokemonService.save(pokemon);
    }

    public void delete(Pokemon pokemon) {
        pokemonService.delete(pokemon);
    }

    public Pokemon update(Pokemon pokemon) {
        return pokemonService.update(pokemon);
    }

}
