
public class Array2 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};
		String[] cars= {"honda","volvo","maruthi","ford"};
		
		System.out.println("Size of array is: "+a.length);
		
		for(int i:a) {
			System.out.println(i);
		}
		for(String s:cars) {
			System.out.println(s);
			if(s.equals("maruthi")) {
				break;
			}
		}
		

	}

}
