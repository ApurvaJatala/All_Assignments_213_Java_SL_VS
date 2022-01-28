package FileHandlingProj;

import java.io.FileReader;
import java.io.FileWriter;


public class FileHandling 
{
	  public static void main( String[] args ) 
	  {

		  String data = "Eclipse is used to run the java programs";

		  try 
		  {
			  // Step 1: Creates a Writer using FileWriter
			  FileWriter output = new FileWriter("C:/Users/OM JATLA/Desktop/DemoFile/FileHandling.txt");
  
			  // Step 2: Writes string to the file
			  output.write(data);
			  System.out.println("Data is written to the file.");

			  // Step 3: Closes the writer
			  output.close();
		  }
		  catch (Exception e)
		  {
			  e.getStackTrace();
		  }


		  char[] array = new char[60];

		  try 
		  {
			  // Step 1: Creates a reader using the FileReader
			  FileReader input = new FileReader("C:/Users/OM JATLA/Desktop/DemoFile/FileHandling.txt");

			  // Step 2: Reads characters
			  input.read(array);
  
			  System.out.println(" Read Data present inside the file  :");
			  System.out.println(array);

			  // Step 3: Closes the reader
			  input.close();
		  }
		  catch(Exception e) 
		  {
			  e.getStackTrace();
		  }

	  }
}

