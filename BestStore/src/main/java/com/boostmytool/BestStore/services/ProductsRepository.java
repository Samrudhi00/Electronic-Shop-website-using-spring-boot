package com.boostmytool.BestStore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.BestStore.models.Product;

public interface ProductsRepository extends JpaRepository<Product,Integer>{

	//springjpa will implement this database for us
}
