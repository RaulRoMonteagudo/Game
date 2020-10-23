package com.example.game.dtos.request;

import com.example.game.entities.Game;
import com.example.game.entities.Shop;

import lombok.Data;

@Data
public class StockRequest {
	
	private long quantity;
	
	private Shop shop;
	
	private Game game;

}
