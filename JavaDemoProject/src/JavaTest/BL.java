package JavaTest;

public class BL {

	public static void main(String[] args) {
    boolean a =true,b =false,c =true,d =false;
    
    System.out.println(a&&b);
    System.out.println(a&&c);
    System.out.println(b&&c);
    System.out.println(c&&d);
    
    System.out.println(a||b);
    System.out.println(b||c);
    System.out.println(b||d);
    System.out.println(d||a);
    
    System.out.println(!a);
    System.out.println(!d);
	}

}
