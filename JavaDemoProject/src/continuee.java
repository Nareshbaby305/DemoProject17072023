
public class continuee {

	public static void main(String[] args) {
		int a=0;
		while(a<5) {
			if(a==5) {
				a++;
				continue;
			}
			System.out.println("inide while loop-value of a is :"+a);
			a++;
		}

	}

}
