package com.example.game.dtos.response;

import lombok.Data;

@Data
public class ShopResponse {
	private String name;
	private String location;
	public ShopResponse(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	
}
