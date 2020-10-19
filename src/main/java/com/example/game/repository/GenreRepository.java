package com.example.game.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	

	Genre findByGenreName(GenderEnum genreName);
}
