package EcommerceApp_Project;

public class Mobile  extends Product{
	
	private final int ram;
	private final String color;
	private final int hd;
	
	
	

	public Mobile(String brand, double price ,int ram,String color,int hd) {
		super(brand, price);
		this.color=color;
		this.ram=ram;
		this.hd=hd;
		
	}
	
	public int getRam() {
		
		return ram;
		
	}
	public String getcolor() {
		
		return color;
	}
    public int getHd() {
    	
    	return hd;
    }



	@Override
	public void buy() {
	
	System.out.println("Mobile bought :"+getBrand()+"\tRam :"+ram+"GB\tColor :"+color+"\thd :"+hd+"GB\tprice :"+getPrice());

		
	}
	public String toString() {
		
		return super.toString()+"\tRam :"+ram+"\tColor :"+color+"\tHd :"+hd+" GB";
		
	}
	

}
