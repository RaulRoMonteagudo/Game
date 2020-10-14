package com.example.game.services.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.convert.GameConverter;
import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.response.GameResponse;
import com.example.game.entities.Game;
import com.example.game.helper.GameHelper;
import com.example.game.repository.GameRepository;
import com.example.game.services.GameService;

@Service
public class GameServiceImpl implements GameService{
	
	
	@Autowired
	private GameHelper gameHelper;
	
	@Autowired
	private GameRepository gameRepo;

	@Override
	public GameResponse addGame(GameRequest gameDto) {
		Game game = GameConverter.dtoToEntity(gameDto);
		gameRepo.save(game);
		return new GameResponse(game.getTitle(), game.getRelease());
	}
	
	@Override
	public GameRequest getGame(String title) {
		Game game = gameRepo.findByTitle(title);
		GameRequest gameRequest = GameConverter.entityToDto(game);
		return gameRequest;
	}

	
}
