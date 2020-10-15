package com.example.game.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.game.dtos.request.GenreRequest;
import com.example.game.dtos.response.GenreResponse;
import com.example.game.services.GenreService;


@RestController
public class GenreController {
	
	@Autowired
	private GenreService genreService;

	@PostMapping("/genre")
	public ResponseEntity<Object> addGenre(@RequestBody @Valid GenreRequest genreRequest, HttpServletRequest request){
		GenreResponse genreResponse = genreService.addGenre(genreRequest);
		return ResponseEntity.status(HttpStatus.OK).body(genreResponse);
	}
}
