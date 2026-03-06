package com.klu;

class Vehicle {
	void start() {
		System.out.println("Vehicle Started");
	}
}
class Car extends Vehicle {
	void drive() {
		System.out.println("Driver is driving the vechile");	
		
	}
	
}
class ElectricCar extends  Car {
	void moving() {
		System.out.println("The electic car is moving");
	}
}
public class RollNo2420080024 {
	public static void main(String[]args) {
		ElectricCar myCar = new ElectricCar();
		myCar.start();
		myCar.drive();
		myCar.moving();
		
	}
	
}