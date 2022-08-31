package co.com.dalmope.api;
import co.com.dalmope.usecase.pokemon.PokemonUseCase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiRest {
    private final PokemonUseCase pokemonUseCase;

    public ApiRest(PokemonUseCase pokemonUseCase){
    this.pokemonUseCase = pokemonUseCase;
    }

    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }
}
