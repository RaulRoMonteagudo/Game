package com.example.game.dtos.response;

import com.example.game.entities.Game;
import com.example.game.entities.Shop;

import lombok.Data;

@Data
public class StockResponse {
	private Long quantity;
	
	private Shop shop;
	
	private Game game;

	public StockResponse(Long quantity, Shop shop, Game game) {
		super();
		this.quantity = quantity;
		this.shop = shop;
		this.game = game;
	} 
	
	
}
