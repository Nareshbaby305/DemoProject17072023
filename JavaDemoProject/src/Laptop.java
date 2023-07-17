
public class Laptop {

	String color;
	String model;
	int cost;
	int ram;
	
	public void powerOn() {
		System.out.println(model+" laptop powerOn");
	}
	public void shutDown() {
		System.out.println(model+" laptop shutDown");
	}
	public void laptopDetails() {
		System.out.println("color of laptop is: "+color);
		System.out.println("model of laptop is: "+model);
		System.out.println("cost of laptop is: "+cost);
		System.out.println("ram of laptop is: "+ram);
	}
}
