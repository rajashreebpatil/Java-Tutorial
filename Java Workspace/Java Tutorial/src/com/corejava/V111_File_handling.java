import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 	

public class V111_File_handling { 
	public static void main(String[] args) {
		
		// CODE TO CREATE A FILE
		
		File my =new File( "file.txt");
		
		try {
			my.createNewFile();
		} catch (IOException e) {
			System.out.println("unable to create file");
			e.printStackTrace();
		}
		
		// CODE TO WRITE TO A FILE
		
		try {
			FileWriter a= new FileWriter("file.txt");
			a.write("this is fiest file");
			a.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
