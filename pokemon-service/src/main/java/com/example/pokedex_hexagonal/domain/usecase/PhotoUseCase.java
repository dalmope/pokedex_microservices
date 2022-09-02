package com.example.pokedex_hexagonal.domain.usecase;

import com.example.pokedex_hexagonal.domain.model.Photo;
import com.example.pokedex_hexagonal.domain.spi.IPhotoServicePort;

import java.util.List;

public class PhotoUseCase {

    private final IPhotoServicePort photoPersistencePort;

    public PhotoUseCase(IPhotoServicePort photoPersistencePort) {
        this.photoPersistencePort = photoPersistencePort;
    }

    public Photo savePhoto(Photo photo) {
        return photoPersistencePort.savePhoto(photo);
    }

    public List<Photo> getAllPhotos() {
        return photoPersistencePort.getAllPhotos();
    }

    public Photo getPhoto(String photoId) {
        return photoPersistencePort.getPhoto(photoId);
    }

    public void updatePhoto(Photo photo) {
        photoPersistencePort.updatePhoto(photo);
    }

    public void deletePhoto(String photoId) {
        photoPersistencePort.deletePhoto(photoId);
    }
}