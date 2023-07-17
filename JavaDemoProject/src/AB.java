
public class AB {

	
	String firstname;
	String lastname;
	int lifespan;
	
	public AB(String firstname,String lastname,int lifespan)
    {
		this.firstname=firstname;
		this.lastname=lastname;
		this.lifespan=lifespan;
    }
	public void busname() {
		System.out.println("Name of bus is: "+firstname+lastname);
	}
	public void buslifespan() {
		System.out.println("lifespan of bus is: "+lifespan);
	}
}
