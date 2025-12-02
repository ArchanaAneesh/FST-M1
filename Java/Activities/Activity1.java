package examples;

public class Activity1 {
	public static void main(String[] args) {
		Car skoda = new Car();
		skoda.make = 2020;
		skoda.color = "Black";
		skoda.transmission = "Manual";
    
        //Using Car class method
		skoda.displayCharacterstics();
		skoda.accelerate();
		skoda.brake();
		
	}

}
