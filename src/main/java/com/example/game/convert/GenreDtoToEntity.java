package com.example.game.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.game.dtos.request.GenreRequest;
import com.example.game.dtos.response.GenreResponse;
import com.example.game.entities.Genre;

@Component
public class GenreDtoToEntity implements Converter<GenreRequest, Genre> {

	public Genre convert(GenreRequest genreRequest) {
		Genre genre = new Genre();
		genre.setGenreName(genreRequest.getGenreName());
		return genre;
	}

}
