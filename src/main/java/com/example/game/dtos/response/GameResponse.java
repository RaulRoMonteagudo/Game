package com.example.game.dtos.response;

import java.util.Date;

import lombok.Data;

@Data
public class GameResponse {

	private String title;
	private Date date;
	
	public GameResponse(){
		
	}

	public GameResponse(String title, Date date) {
		super();
		this.title = title;
		this.date = date;
	}
	
	
}
