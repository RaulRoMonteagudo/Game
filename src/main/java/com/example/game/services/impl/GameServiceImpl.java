package com.example.game.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.convert.GameConverter;
import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.response.GameResponse;
import com.example.game.entities.Game;
import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;
import com.example.game.helper.GameHelper;
import com.example.game.repository.GameRepository;
import com.example.game.repository.GenreRepository;
import com.example.game.services.GameService;



@Service
public class GameServiceImpl implements GameService{
	
	
	@Autowired
	private GameHelper gameHelper;
	
	
	@Autowired
	private GameRepository gameRepo;
	
	@Autowired
	private GenreRepository genreRepo;

	@Override
	public GameResponse addGame(GameRequest gameDto) {
		Game game = GameConverter.dtoToEntity(gameDto);
		Genre genre = new Genre();
		List<Genre> genreList = new ArrayList<Genre>();
		for(GenderEnum genreName: gameDto.getGenre()) {
			genre = genreRepo.findByGenreName(genreName);
			genreList.add(genre);
			
		}
		game.setGenres(genreList);
		gameRepo.save(game);
		return new GameResponse(game.getTitle(), game.getRelease());
	}
	
	@Override
	public GameRequest getGame(String title) {
		System.out.println(title);
		Optional<Game> game = gameRepo.findByTitle(title);
		GameRequest gameRequest = GameConverter.entityToDto(game);
		return gameRequest;
	}

	
}