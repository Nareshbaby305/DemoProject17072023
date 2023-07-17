
public class Top {

	public static void main(String[] args) {
		Laptop hp = new Laptop();
		
		hp.color="silver";
		hp.model="HP";
		hp.cost=600000;
		hp.ram=6;
		
        hp.powerOn();
        hp.shutDown();
        hp.laptopDetails();
	}

}
