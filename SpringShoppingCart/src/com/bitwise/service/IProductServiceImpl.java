package com.bitwise.service;

import java.util.ArrayList;
import java.util.HashSet;

public class IProductServiceImpl implements IProductService {

	
	double price = 0.00; 
	double price1=0.00;
	double totalAmount=0.00;
	@Override
	public double productprice(ArrayList<String> items) {
	/*	itemSet.add(item);*/
		for(String item: items){
			/*System.out.println("Item in HashSet="+item);*/
		if (item.equalsIgnoreCase("cat")) {
			price = 100.00;
			
		}
		else
		{
			price = 200.00;
		
		}
		
		/*totalAmount=totalPrice(price);*/
		//System.out.println(price);
		}
		totalAmount=totalPrice(price);
		
		return totalAmount;
		
	}
	
	public double totalPrice(double priceForTotal){
		price1=price1+priceForTotal;
		//System.out.println("Total Price"+price1);
		return price1;
	}

	
	
	
}
