package EcommerceApp_Project;

public class Laptop  extends Product{
	
	private final int ram;
	private final String color;
	private final int ssd;

	public Laptop(String brand, double price,int ram,String color,int ssd) {
		super(brand, price);
		this.color=color;
		this.ram=ram;
		this.ssd=ssd;
		
	}
               public int getRam() {
		
		       return ram;	
	           }
	           public String getcolor() {
		
		       return color;
	          }
              public int getSsd() {
    	
    	      return ssd;
             }
	        @Override
	        public void buy() {
	        	System.out.println("Laptop bought: " + getBrand() + "\tRAM: " + ram + "GB\tColor: " + color + "\tHD: " + ssd + "GB\tPrice: " + getPrice());
		    }
	        @Override
	    	public String toString() {
	    		return super.toString()+"\tRAM: " + ram + "GB\tColor: " + color + "\tHD: " + ssd + "GB";
	    	}

}
