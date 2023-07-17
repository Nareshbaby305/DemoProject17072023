package JavaTest;

public class Electronic {

	public static void main(String[] args) {
		Sony s = new Sony();
		s.brand="Sony";
		s.model="4hd";
		s.cost= 600000;
		
		s.name();
		s.cost();

		Samsung m = new Samsung();
		
		m.brand="Samsung";
		m.color="Black";
		m.model="5hd";
		m.cost=800000;
		
		m.color();
		m.name();
		m.cost();
	}

}
