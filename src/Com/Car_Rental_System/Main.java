package Com.Car_Rental_System;

public class Main {

	public static void main(String[] args) {
		
		CarRentalSystem rentalSystem = new CarRentalSystem();
		
		Car c1= new Car("C001","toyota","Camry",60.0);//
		Car c2= new Car("C002","Honda","Accord",80.0);
		Car c3= new Car("C003","Mahindra","Thar",120.0);
		
		
		rentalSystem.addCar(c1);
		rentalSystem.addCar(c2);
		rentalSystem.addCar(c3);
		
		rentalSystem.menu();
		
	}

}
