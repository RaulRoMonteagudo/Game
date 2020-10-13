package com.example.game.exceptions;

import com.example.game.exceptions.generic.NotFoundExecption;

public class GameNotFoundException extends NotFoundExecption{

	private static final long serialVersionUID = 1L;
	
	private static final String DETAIL = "Juego no encontrado";
	
	
	public GameNotFoundException(String detalle) {
		super(detalle);
	}

	public GameNotFoundException() {
		super(DETAIL);
	}
}
