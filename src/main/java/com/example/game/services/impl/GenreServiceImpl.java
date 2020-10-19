package com.example.game.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.convert.GenreDtoToEntity;
import com.example.game.dtos.request.GenreRequest;
import com.example.game.dtos.response.GenreResponse;
import com.example.game.entities.Genre;
import com.example.game.repository.GenreRepository;
import com.example.game.services.GenreService;



@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	GenreRepository genreRepository;
	
	@Autowired
	GenreDtoToEntity genreDtoToEntity;
	
	@Override
	public GenreResponse addGenre(GenreRequest genreRequest) {
		Genre genre = genreDtoToEntity.convert(genreRequest);
		genreRepository.save(genre);
		return new GenreResponse(genre.getGenreName());
	}

}