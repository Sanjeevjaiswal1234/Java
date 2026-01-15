package EcommerceApp_Project;

public  abstract class Product implements Buyable {
	
	private  final String brand ;
	private  double price;
	
	public Product(String brand,double price ) {
		
		
		this.brand=brand;
		this.price=price;
	}
	public String getBrand() {
		
		return brand;
	}
	public double getPrice() {
		
		return price;
		
	}
	
	public String toString() {
		
		return "Brand :"+brand+"\tprice is : "+price;
	}

}
