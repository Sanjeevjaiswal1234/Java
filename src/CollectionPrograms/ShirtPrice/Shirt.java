package CollectionPrograms.ShirtPrice;

public class Shirt {
	
	 String brand;

	 String color;
	
	 double price;
	 int size;
	
	Shirt(){
		
	}
	Shirt(String brand, String color,double price,int size){
		
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.size=size;
			
	}
	
	@Override
	public String toString() {
		
		return "Brand :"+brand+"\tColor :"+color+"\tprice :" +price+"\tSize :"+size;
	}
	
}
