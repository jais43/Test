package com.bitwise.shoppingcart.Model;
import java.util.ArrayList;

public class PetList {
	

private String category;
	
	public PetList(String category) {
		this.category = category;
		
	}
	public ArrayList<String> getPet() {
		
		ArrayList petlist = new ArrayList<String>(); 
		if(category.equalsIgnoreCase("cat"))
		{
			petlist.add("french Cat");
			petlist.add("German Cat");
		}
		else {
			petlist.add("pug");
			petlist.add("German Shepard");
		}
		return petlist;
	}



}
