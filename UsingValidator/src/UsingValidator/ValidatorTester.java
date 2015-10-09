package UsingValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ValidatorTester {
	public static void main(String[] args) {
		User person = new User();
		
		person.setName("Name: ");
		person.setAge("Age: 1 - 100", 1, 100);
		person.setHeight("Height: 36 - 92", 36, 92);
		person.setWeight("Weight: 80 - 400", 80, 400);
		person.setFavNumber("Favorite Numner: 0 - 1", 0, 1);
		
		System.out.println("Name:\t" + person.getName());
		System.out.println("Age:\t" + person.getAge());
		System.out.println("Height:\t" + person.getHeight());
		System.out.println("Weight:\t" + person.getWeight());
		System.out.println("Number:\t" + person.getFavNumber());
		
		//get a filename
		 String filename = (System.getProperty("user.dir") + File.separatorChar +"file2015Oct.txt");
		//write to a file
		 PrintWriter writer = null;
		 try {
			writer = new PrintWriter(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 writer.println(person.getName());
		 writer.println(person.getAge());
		 writer.println(person.getHeight());
		 writer.println(person.getWeight());
		 writer.println(person.getFavNumber());
		 writer.close();
		 
		 //read a file
		// This will reference one line at a time
	        String line = null;

	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = new FileReader(filename);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                		filename + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + filename + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
		
	}
}
