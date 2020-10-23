package com.example.game.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.response.GameResponse;
import com.example.game.entities.Game;
import com.example.game.services.GameService;

@RestController
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping("/game")
	public ResponseEntity<Object> getGame(@RequestParam("title") String title, HttpServletRequest request){
		return ResponseEntity.status(HttpStatus.OK).body(gameService.getGame(title));
	}
	
	@PostMapping("/game")
	public ResponseEntity<Object> addGame(@RequestBody @Valid GameRequest gameRequest, HttpServletRequest request){
		GameResponse gameResponse = gameService.addGame(gameRequest);
		return ResponseEntity.status(HttpStatus.OK).body(gameResponse);
	}
	@PutMapping("/game/{id}")
	public ResponseEntity<Object> updateGame(@RequestBody Game game, @PathVariable long id) {
		GameResponse gameResponse = gameService.updateGame(id, game);
		return ResponseEntity.status(HttpStatus.OK).body(gameResponse);
	}
	
	
}
