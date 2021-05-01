package firstProject.com;
import java.io.IOException;
import java.util.Scanner;
public class MainMenu {
	
	public static void main(String[] args) {
		
		WelcomePage wp = new WelcomePage();
		wp.Info();
		int choice;
	 @SuppressWarnings("resource")
	Scanner in= new Scanner(System.in);
	System.out.println(" welcome to LockMe company recordBook ");		
	while(true) {
	//display menu
	
	System.out.println("===============================");
	System.out.println(" 1.File Display in Ascending Order ");
	System.out.println(" 2. Create  New Record :");
	System.out.println(" 3.Write On Record :");
	System.out.println(" 4.Read  Record :");
	System.out.println("5.Search Record :");
	System.out.println("6. Delete Record :");
	System.out.println("7.Exit");
    System.out.println("=================================");
	System.out.print("Enter Choice :" );
	//Get Choice From User
  choice= in.nextInt();
  switch(choice) {
  case 1 :
	  
	  AscendingSort as =new AscendingSort();
	  as.sort();
	  System.out.println("File In Ascending Order");
	  //logic
	  
	  break;
  case 2 :
	  Createfile cf= new Createfile();
	  cf.create();
	  System.out.println("New File Created");
	  //logic
	  break;
  case 3 :
	  WriteFile wf = new WriteFile();
	  wf.write();
	  System.out.println(" File Ready to Write");
	  //logic
	  break;
  case 4 :
	  ReadFile rf = new ReadFile();
	  rf.read();
	  System.out.println("File Ready To Read ");
	  //logic
	  break;
  case 5 :
	  SearchFile sf= new SearchFile();
	  sf.time();
	  System.out.println("Search Complete");
	  //logic
	  break;
  case 6 :
	  DeleteFile del= new DeleteFile();
	  del.delete(); 
	  System.out.println("File Deleted ");
	  //logic
	  break;
  case 7 :
	  System.out.println("GOOD BYE..... thank u");
	  System.exit(0);
	  default :System.out.println("Wrong choice ...Please enter valid  choice");
      }
    }
 }
	
		
		//MainMenu mm= new MainMenu();
		//mm.Disp();
	}

//}
