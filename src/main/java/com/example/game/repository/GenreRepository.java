package com.example.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.game.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
