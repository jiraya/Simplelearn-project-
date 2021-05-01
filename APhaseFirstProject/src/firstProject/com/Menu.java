package firstProject.com;
import java.util.Scanner;
public class Menu {
public static void menu(int options[] , String menuItems[]) {
	//display menu
		System.out.println(" M E N U");
		System.out.println("==============");
		//loop through options and items
		for(int i=0; i<options.length; i++) {
			System.out.printf("%d .  %s\n" ,options[i],menuItems[i]  );
		}
		System.out.println("==============");
		System.out.print("Enter Choice :" );
}
public static void main(String[] args) {
	
	int choice;
	//menu data
	int options[]= {1,2,3,4,5,6,7 };
	String menuItems[]= {"File Display in Ascending Order " ,"Create  New Record :","Write On Record :",
			"Read  Record :"	,"Search Record","Delete Record :","Exit" ,"   "};
	//exit option
	int EXIT= options[options.length-1];
	//display menu
	menu(options, menuItems);
	//set up scanner
	@SuppressWarnings("resource")
	Scanner in= new Scanner(System.in);
	//Get Choice From User
	choice= in.nextInt();
	// menu loop
	while(choice !=EXIT) { 
		if(choice==options[0]) {
		System.out.println(menuItems[0]  + " ");
	}
		
		//check choice value
		else if(choice==options[1]) {
			System.out.println(menuItems[1] + " ");
		}
		else if(choice==options[2]) {
			System.out.println(menuItems[2]  +" ");
			}

		else if(choice==options[3]) {
			System.out.println(menuItems[3]  + " ");
		}
		else if(choice==options[4]) {
			System.out.println(menuItems[4] +" " );
		}
		else if(choice==options[5]) {
			System.out.println(menuItems[5]  +" ");
		}
		else if(choice==options[6]) {
			System.out.println(menuItems[6] + " ");
		}
		else if(choice==options[7]) {
		System.out.println( menuItems[7] +" ");
		} 
		//display menu
		menu(options, menuItems);
		choice= in.nextInt();
	}
	
}
}



