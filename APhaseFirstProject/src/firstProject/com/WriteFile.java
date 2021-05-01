//working properly but not as i want
package firstProject.com;


import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	void write() {
		try { 
			
		/*	path = Paths.get("C:\\Users\\HCL\\eclipse-workspace\\ProjectDemoTOMe\\dadaFile");
			System.out.println(path);
			Path newDirectory = Files.createDirectories(Paths.getParent().resolve("some/new/dir"));
			System.out.println("newDirectory = " + newDirectory);

			Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
			System.out.println("newFile = " + newFile);*/
			
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  };
	}


