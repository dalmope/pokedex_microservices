package co.com.dalmope.jpa;

import co.com.dalmope.jpa.helper.AdapterOperations;
import co.com.dalmope.model.pokemon.Pokemon;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepositoryAdapter extends AdapterOperations<Pokemon, PokemonDto, Long, PokemonRepositoryAdapter>
// implements ModelRepository from domain
{

    public PokemonRepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Object.class/* change for domain model */));
    }
}
