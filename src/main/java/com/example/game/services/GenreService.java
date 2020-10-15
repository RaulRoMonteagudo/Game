package com.example.game.services;

import com.example.game.dtos.request.GenreRequest;
import com.example.game.dtos.response.GenreResponse;

public interface GenreService {
	
	public GenreResponse addGenre(GenreRequest genreRequest);
	

}
