package com.bitwise.shoppingcart.Model;


import java.util.ArrayList;

public class PetColor {
	
public static ArrayList  PetColors(String brd) {
		
		ArrayList petlist = new ArrayList<String>(); 
		
		switch(brd){
		
		case "french Cat" :petlist.add("White");
		                   petlist.add("Black");
		                   
		break;
		
		case "German Cat" :petlist.add("golden");
                           petlist.add("Black");
        
         break;
		case "pug" :       petlist.add("black and white");
                           petlist.add("mud");

        break;
        
		case "German Shepard" :petlist.add("brown");
        					   petlist.add("white");
        					   petlist.add("black");

       break;
		}
		return petlist;
}


public static double Petprice(String brd) {
	
	double price = 0.00; 
	
	switch(brd){
	
	case "french Cat" :price =1500.00;
	                   
	break;
	
	case "German Cat" :price =1000.00;
    
     break;
	case "pug" :price =9000.00;

    break;
    
	case "German Shepard" :price =15000.00;

   break;
	}
	return price;
}




}