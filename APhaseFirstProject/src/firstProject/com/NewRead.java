//user file file delete prog experimentinggg
//file created but need to work on data adding
package firstProject.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewRead {
@SuppressWarnings({ "unused", "resource" })
void read1() {
	try {
		//String folderPath = s.next();
	  //  File folder = new File(folderPath);
	   // delete simple file
		//String myobj=src.next();
		File myobj= new File("my.txt");
		Scanner src= new Scanner(myobj);
		while(src.hasNext() ) {
			String name= src.nextLine();
			System.out.println("name" +name);
			//String name= src.nextLine();
			String city= src.nextLine();
			System.out.println("name" +city);
			
		}
		src.close();
		    } 
	catch(FileNotFoundException e) {
		System.out.println("An error occurred");
		e.printStackTrace();
	}
}
void write() {
	System.out.println("Enter the path to folder to add Files with data" );
    Scanner s1 = new Scanner(System.in);
    String name=" ";
    String city=" ";
    String answer= "y";
    String prevCont=" ";
    FileWriter fwriter= null;
    BufferedWriter writer =null;
    String folderPath = s1.next();
    File folder = new File(folderPath);
   // delete simple file
    System.out.println("Enter what you want to write in file:-");
			@SuppressWarnings("unused")
			File myObj = new File(folderPath); 
	while(answer.equals("y"))
	{
				System.out.println("Enter name:-");
				name=s1.nextLine();
				System.out.println(" enter city:-");
				city=s1.nextLine();
			prevCont=prevCont + name+"\n" + "\n" +city + "\n";
			try {
				@SuppressWarnings({ "unused", "resource" })
				FileWriter myWriter = new FileWriter(folderPath);
				writer= new BufferedWriter(fwriter);
				writer.write(String.valueOf(prevCont));
				writer.close();
			      //myWriter.write("Files in Java might be tricky, but it is fun enough!");
			      //myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      
			    }
			read1();
			System.out.println("Do want to add another File ?  y/n ");
			answer=s1.nextLine();
			if(answer.equals("n"))
			{
				System.out.println("Exiting!!");
				break;
			}
	}
}
public static void main(String[] args) {
					NewRead nr= new NewRead();
					nr.write();
					nr.read1();
				}
}
