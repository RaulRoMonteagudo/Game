package com.example.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.game.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

}
