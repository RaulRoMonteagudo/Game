package com.example.game.services;

import com.example.game.dtos.request.StockRequest;
import com.example.game.dtos.response.StockResponse;

public interface StockService {
	
	public StockResponse addStock(StockRequest stockRequest);

}
