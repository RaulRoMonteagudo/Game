package com.example.game.services;

import com.example.game.dtos.request.ShopRequest;
import com.example.game.dtos.response.ShopResponse;

public interface ShopService {

	public ShopResponse addShop(ShopRequest shopRequest);
}
