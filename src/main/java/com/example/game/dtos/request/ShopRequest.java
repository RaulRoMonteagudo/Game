package com.example.game.dtos.request;

import java.util.List;

import com.example.game.entities.Stock;

import lombok.Data;

@Data
public class ShopRequest {
	
	private String name;
	
	private String location;
	
	private List<Stock> stock;
}
