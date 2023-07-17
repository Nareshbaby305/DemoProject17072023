import java.io.File;

public class DemoFile {

	public static void main(String[] args) {
		
		File file = new File(System.getProperty("user.dir")+"\\Xyz\\Abc.txt");
		
		if(file.exists()) {
			
			System.out.println("File exits at provided path");
		}
		else {
			System.out.println("File is not available at provided path");
		}

	}

}
