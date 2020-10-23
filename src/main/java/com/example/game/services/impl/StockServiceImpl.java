package com.example.game.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.dtos.request.StockRequest;
import com.example.game.dtos.response.StockResponse;
import com.example.game.services.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepo;
	
	@Override
	public StockResponse addStock(StockRequest stockRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
