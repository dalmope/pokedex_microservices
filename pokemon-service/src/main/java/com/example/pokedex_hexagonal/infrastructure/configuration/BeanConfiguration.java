package com.example.pokedex_hexagonal.infrastructure.configuration;

import com.example.pokedex_hexagonal.domain.spi.IPhotoPersistencePort;
import com.example.pokedex_hexagonal.infrastructure.out.mongodb.adapter.PhotoMongodbAdapter;
import com.example.pokedex_hexagonal.infrastructure.out.mongodb.mapper.PhotoEntityMapper;
import com.example.pokedex_hexagonal.infrastructure.out.mongodb.repository.IPhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IPhotoRepository photoRepository;
    private final PhotoEntityMapper photoEntityMapper;

    @Bean
    public IPhotoPersistencePort photoPersistencePort() {
        return new PhotoMongodbAdapter(photoRepository, photoEntityMapper);
    }
}