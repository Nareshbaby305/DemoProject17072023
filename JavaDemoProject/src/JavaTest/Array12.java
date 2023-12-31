package JavaTest;

public class Array12 {

	public static void main(String[] args) {
		
		        int[] numbers = {50, 80, 20, 10, 30};
		        
		        int max1 = Integer.MIN_VALUE;
		        int max2 = Integer.MIN_VALUE;
		        
		        for (int num : numbers) {
		            if (num > max1) {
		                max2 = max1;
		                max1 = num;
		            } else if (num > max2 && num < max1) {
		                max2 = num;
		            }
		        }
		        
		        System.out.println("Second highest number: " + max2);
		    }
		}
