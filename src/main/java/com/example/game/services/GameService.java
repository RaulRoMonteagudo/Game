package com.example.game.services;

import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.response.GameResponse;
import com.example.game.entities.Game;

public interface GameService {

	public GameResponse addGame(GameRequest gameDto);
	
	public GameRequest getGame(String title);
	
	public GameResponse updateGame(long id, Game game);
}
