package shapeBasedproject;

public class Cube  implements ThreeDShape{
	 
	   double a ;
	   Cube( double a){
		   this.a = a;
	   }
	   public void volume() {
		   double volume = a*a*a;
		   System.out.println("The volume of cube is a"+volume+"m3");
   
	   }
	   public void lsa() {
		   double lsa = 6*a;
		   System.out.println(" Cube lateral surface area is a : "+lsa);

	   }
	   public void tsa() {
		   double tsa = 6*a*a;
		   System.out.println("Cube total surface area is a : " +tsa);

	   }

}
