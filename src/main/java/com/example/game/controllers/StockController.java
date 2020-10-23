package com.example.game.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.dtos.request.ShopRequest;
import com.example.game.dtos.request.StockRequest;
import com.example.game.dtos.response.ShopResponse;
import com.example.game.dtos.response.StockResponse;
import com.example.game.services.ShopService;

@RestController
public class StockController {

	@Autowired
	private StockService stockService;

	@PostMapping("/addStock")
	public ResponseEntity<Object> addShop(@RequestBody @Valid StockRequest stockRequest, HttpServletRequest request){
		StockResponse stockResponse = stockService.addShop(stockRequest);
		return ResponseEntity.status(HttpStatus.OK).body(stockResponse);
	}
}
