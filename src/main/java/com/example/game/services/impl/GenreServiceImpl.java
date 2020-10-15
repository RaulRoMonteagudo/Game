package com.example.game.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.game.dtos.request.GenreRequest;
import com.example.game.dtos.response.GenreResponse;
import com.example.game.repository.GenreRepository;
import com.example.game.services.GenreService;

public class GenreServiceImpl implements GenreService {

	@Autowired
	GenreRepository genreRepository;
	
	@Override
	public GenreResponse addGenre(GenreRequest genreRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
