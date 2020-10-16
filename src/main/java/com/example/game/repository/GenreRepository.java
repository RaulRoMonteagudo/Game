package com.example.game.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.game.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	
	Optional<Genre> findByGenreName(String genreName);
}
