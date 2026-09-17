// package oops;
class Vehicle{
	void start(){
	 System.out.println("Vehicle starting");
	}
	
}

//SubClass (Child)
class Car extends Vehicle{
	void honk(){
		System.out.println("Car is Honking");
	}
	void stop() {
		System.out.println("Vehicle stopping");
	}
}

public class inheritance {
    public static void main(String[] args) {
        Car myCar = new Car(); 
		
		//Calling inherited methods(from vehicle)
		myCar.start();
		myCar.stop();
		//Calling child class method
		myCar.honk();
    }
}