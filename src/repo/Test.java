package repo;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		debuggingExercise1_2();				
	}

	
	public static  void debuggingExercise1_2() {

		
		ShoppingBasket johnShoppingBasket= new ShoppingBasket();
		johnShoppingBasket.addTobasket("Bread");
		johnShoppingBasket.addTobasket("Water");
	    System.out.println("john bill : " + johnShoppingBasket.getBill());
	    
	    ShoppingBasket saraShoppingBasket= new ShoppingBasket();
	    saraShoppingBasket.setTotalPrice(0);
	    saraShoppingBasket.addTobasket("Pasta");
	    saraShoppingBasket.addTobasket("Milk");
	    System.out.println("sara bill : "+ saraShoppingBasket.getBill());
	    
		
	}
}
	
	class ShoppingBasket {
		public static Items item_list=new Items();
		private Integer totalPrice=0;
		

		ArrayList<String> MyItems=new ArrayList<String>();

		public ShoppingBasket() {

		}
		
		public void addTobasket(String item) {
			

			setTotalPrice(getTotalPrice()+ item_list.getPrice(item));
				
			
		}
		
	public Integer getBill() {
			
			return getTotalPrice();
			
			
		}

	public  Integer getTotalPrice() {
		return totalPrice;
	}

	public  void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	}
	class Items {
		
		HashMap<String, Integer> priceMap=new HashMap<String, Integer>();

		public Items() {
		
			this.priceMap.put("Milk",2);  
			this.priceMap.put("Bread",1);  
			this.priceMap.put("Yoghurt",1);  
			this.priceMap.put("Water",1);  
			this.priceMap.put("Cheese",3);  
			this.priceMap.put("Pasta",1);  
			this.priceMap.put("Shampoo",3);  
			this.priceMap.put("Potato",2); 
			
		}  
	    
	    
	    public Integer getPrice(String item) {
	    	return priceMap.get(item);
	    }
	}

