
public class TwoDime2 {

	public static void main(String[] args) {
		int[][] a= {{10,20,30},{100,200,300}};
		System.out.println("No of rows: "+a.length);
		System.out.println("No of cols: "+a[0].length);
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++){
		System.out.println(a[row][col]);

	}

	}
}
}