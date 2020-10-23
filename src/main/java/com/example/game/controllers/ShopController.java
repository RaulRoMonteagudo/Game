package com.example.game.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.dtos.request.GameRequest;
import com.example.game.dtos.request.ShopRequest;
import com.example.game.dtos.response.GameResponse;
import com.example.game.dtos.response.ShopResponse;
import com.example.game.services.ShopService;

@RestController
public class ShopController {
	
	@Autowired
	private ShopService shopService;

	@PostMapping("/shop")
	public ResponseEntity<Object> addShop(@RequestBody @Valid ShopRequest shopRequest, HttpServletRequest request){
		ShopResponse shopResponse = shopService.addShop(shopRequest);
		return ResponseEntity.status(HttpStatus.OK).body(shopResponse);
	}
}
