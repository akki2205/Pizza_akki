package com.pizza;

public class Pizza {

	private int price;
	private Boolean veg;
	
	private int addExtraCheezeprice=100;
	private int addExtraToppingPrice=150;
	private int bagPackPrice=20;
	
	private int basePizzaPrice;
	
	private boolean isextraCheezAdded=false;
	private boolean isextraToppinngsAdded=false;
	private boolean optedTakeAway=false;
	
	public Pizza(Boolean veg) {
		
		this.veg = veg;
		
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		
		basePizzaPrice=this.price;
	}
	
	public void addExtracheez() {
		isextraCheezAdded=true;
		this.price+=addExtraCheezeprice;
	}
	
	public void getBill() {
		String bill="";
		System.out.println("Pizza "+basePizzaPrice);
		if(isextraCheezAdded) {
			bill="extra cheez added +"+addExtraCheezeprice+"\n ";	
		}
		bill+="Bill "+this.price+" \n";
		System.out.println(bill);
	}
	
}
