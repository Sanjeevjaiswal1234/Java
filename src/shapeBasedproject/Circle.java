package shapeBasedproject;

public class Circle implements TwoDshape {
         
	
	   double r ;
	      Circle(double r){
		   this.r = r;
	   }
	   @Override
	   public void area() {
		   double area =Math.PI*r*r;
		   System.out.println(" Area of the circule is :"+area+" sq.units");
		   

	   }
	   @Override
	  public void perimeter() {
		   double perimeter = 2*Math.PI*r;
		   System.out.println("Perimeter of the circle is :"+perimeter+"Units");

		    
		  
	  }
	   
	   
	
}
