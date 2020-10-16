package com.example.game.dtos.response;

import com.example.game.enums.GenderEnum;

import lombok.Data;

@Data
public class GenreResponse {
	private GenderEnum genreName;
	
	public GenreResponse(){
		
	}

	public GenreResponse(GenderEnum genreName) {
		super();
		this.genreName = genreName;
	}
	}
