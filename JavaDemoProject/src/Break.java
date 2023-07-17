
public class Break {

	public static void main(String[] args) {
		int a=0;
		while(a<5) {
			if(a==5) {
				break;
			}
			System.out.println("inide while loop-value of a is :"+a);
			a++;
		}
	}

}
