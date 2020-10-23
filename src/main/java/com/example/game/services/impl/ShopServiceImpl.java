package com.example.game.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.convert.ShopDtoToEntity;
import com.example.game.dtos.request.ShopRequest;
import com.example.game.dtos.response.ShopResponse;
import com.example.game.entities.Shop;
import com.example.game.repository.ShopRepository;
import com.example.game.services.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	ShopRepository shopRepo;
	
	@Autowired
	ShopDtoToEntity shoptDtoToEntity;

	@Override
	public ShopResponse addShop(ShopRequest shopRequest) {
		Shop shop = shoptDtoToEntity.convert(shopRequest);
		
		shopRepo.save(shop);
		
		return new ShopResponse(shop.getName(), shop.getLocation());
	}

}
