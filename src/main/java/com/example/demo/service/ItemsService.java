package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Items;

@Service
public class ItemsService{
	

	
	public Items get(int itemId){
		return new Items(123,"Dress",100.00,2);
	}
	
	public List<Items> getAll(){
		List<Items> items = new ArrayList<>();
		items.add(new Items(111,"Dress",100.00,2));
		items.add(new Items(112,"Mobile",10000.00,1));
		items.add(new Items(113,"Laptop",100000.00,1));
		items.add(new Items(114,"Paste",100.00,20));
		items.add(new Items(115,"Table",10000.00,10));
		items.add(new Items(116,"Phone",100000.00,10));
		return items;
	}
	
	public Items update(Items item) {
		return item;
	}
	
	public void delete(Items item) {
		System.out.println("Item deleted");
	}

}
