package emailMaker;
import java.util.Scanner;
import java.util.ArrayList;

public class DBInsert {
	private static Scanner scan = new Scanner(System.in);
	private static String[] data = new String[4];
	private static String[] text = {"First name", "Last name" ,"Department" ,"Company"};
	public static ArrayList<Employee> allEmployee = new ArrayList<Employee>();

	public static void signUp() {
		String choose;
		
		//handling run-time error
		do {
			try {
				//instruction for user
				System.out.print("Do you come from a Company? (y/n) \n");
						
				//Take input from user for the number of products to add
				choose = scan.nextLine();
				if(choose.equals("y")) {
					signUpFull();
					break;
				}
				else if (choose.equals("n")) {
					signUpGuest();
					break;
				}
				else {
					throw new Exception();
				}
			}
			catch (Exception e) {
				System.out.println("Incorrect data entered!");
				//scan.nextLine();
			}	
		}while(true);
		
	}
	
	public static void signUpGuest(){
		System.out.println("============Sign Up=============\n"
		                 + "-------------Guest--------------");
		System.out.println("Please insert your personal data:");
		for(int i=0; i<text.length-2;i++) {
			System.out.print(text[i]+" : ");
			data[i]=scan.nextLine();
		}
		allEmployee.add(new Employee(data[0],data[1]));
	}
	
	public static void signUpFull() {
		System.out.println("============Sign Up=============\n"
				         + "------------Company-------------");
		System.out.println("Please insert your personal data:");
		for(int i=0; i<text.length;i++) {
			System.out.print(text[i]+" : ");
			data[i]=scan.nextLine();
		}
		allEmployee.add(new Employee(data[0],data[1],data[2],data[3]));
	}

	
}
