package com.example.game.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.game.dtos.request.ShopRequest;
import com.example.game.entities.Shop;
import com.example.game.entities.Stock;

@Component
public class ShopDtoToEntity implements Converter<ShopRequest, Shop> {

	public Shop convert(ShopRequest shopRequest) {
		Shop shop = new Shop();
		shop.setName(shopRequest.getName());
		shop.setLocation(shop.getLocation());
		
		List<Stock> stockList = new ArrayList<Stock>();
		
		for(Stock stock: shopRequest.getStock()) {
			stockList.add(stock);
		}
		
		shop.setStock(stockList);
		return shop;
	}

	
}
