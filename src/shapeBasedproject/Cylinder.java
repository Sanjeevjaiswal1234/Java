package shapeBasedproject;

public class Cylinder  implements ThreeDShape{
        
	          double r , h;
	          Cylinder(double r , double h){
	        	  this.r= r;
	        	  this.h=h;
	          }
	          @Override
	          public void volume() {
	        	  double vol = Math.PI*r*h;
	        	  System.out.println("volume of cylinder is: " +vol+" Cu.unit");
	        	  

	          }
	          @Override
	          public void lsa() {
	        	  double lsa = 2*Math.PI*r*h;
	        	  System.out.println(" Lateral suface ssarea of cylinder is :"+lsa+" unit.");

	          }
	          public void tsa() {
	        	  double tsa = 2*Math.PI*r*(r+h);
	        	  System.out.println(" Total surface area of cylinder is :"+tsa+" unit.");

	          }
	          
	          
}
