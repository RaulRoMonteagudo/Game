package com.example.game.convert;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.game.dtos.request.GameRequest;
import com.example.game.entities.Game;

@Component
public class GameConverter {

	public static Game dtoToEntity(GameRequest gameDto) {
		Game game = new Game();
		game.setTitle(gameDto.getTitle());
		game.setDescription(gameDto.getDescription());
		game.setRelease(gameDto.getRelease());
		return game;
	}
	
	public static GameRequest entityToDto(Optional<Game> game) {
		GameRequest gameRequest= new GameRequest();
		gameRequest.setTitle(game.get().getTitle());
		gameRequest.setRelease(game.get().getRelease());
		gameRequest.setDescription(game.get().getDescription());
		//gameRequest.setGenre(game.get().getGenres()));
		return gameRequest;
	}
}
