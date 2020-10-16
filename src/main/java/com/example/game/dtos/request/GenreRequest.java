package com.example.game.dtos.request;

import com.example.game.enums.GenderEnum;

import lombok.Data;

@Data
public class GenreRequest {

	private GenderEnum genreName;
}
