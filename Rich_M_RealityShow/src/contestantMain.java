import java.util.Scanner;

/**
 * @author M Rich
 */
public class contestantMain {

	/**
	 * @param args
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();
		Scanner scan = new Scanner(System.in);	
			
			System.out.print("Welcome to probably one of the lamest gameshows to date!"+"\n" + "It appears you wish to be on the show."+"\n" + "To get on the show, you will have to fill out a small form as well as answer a skill testing question."+"\n"+"\n"+"\n");		
			boolean entry;
			do{
			    entry = false;
				System.out.print("Enter your first name: ");
				String fName = scan.nextLine();
				
				System.out.print("Enter your last name: ");
				String lName = scan.nextLine();
				
//				do{
//					flag = false;
//					System.out.print("Enter your year of birth");
//					String bYear = scan.nextLine();
//					System.out.print("Enter your month of birth");
//					String bmonth = scan.nextLine();
//					try {
//						contestant1.setbirthYear(bYear);
//						contestant1.setbirthMonth(bYear);
//					}
//					catch(InvalidInputException e){
//						System.out.println(e.getMessage());
//						flag = true;
//					}
//				}
//				while (flag);
				
				flag = false;
				System.out.print("Enter your Province ");
				String p = scan.nextLine();
				if (p == "Manitoba"||p=="mb"){
	
//nope
					}
				
				System.out.print("Enter your city ");
				String c = scan.nextLine();
				
				System.out.print("Enter your street address ");
				String stAddress = scan.nextLine();
		
				do{
					flag = false;
					System.out.print("Enter your postal code (X#x#x# format) ");
					String postCode = scan.nextLine();
					try {
					contestant1.setpostalCode(postCode);  
					}
					catch(InvalidInputException e){
						System.out.println(e.getMessage());
						flag = true;
					}
				}
				while (flag);
				
				
				do{
					flag = false;
					System.out.print("Enter your phonenumber without spaces (Eg 416XXXXXXX) "+"\n");
					String pNumber = scan.nextLine();
					try {
						contestant1.setphoneNumber(pNumber);
					}
					catch(InvalidInputException e){
						System.out.println(e.getMessage());
						flag = true;
					}
				}
				while (flag);
				
	//			do{
	//				flag = false;
	//				System.out.print("Please answer this skilltesting question. ");
	//				String question = generateQuestion();
	//				try {
	//					
	//				}
	//				catch(InvalidInputException e){
	//					flag = true;
	//				}
	//			}
	//			while (flag);
		
				contestant1.setFirstName(fName);
				contestant1.setlastName(lName);

				contestant1.setcity(c);
				contestant1.setprovince(p);
				contestant1.setstreetAddress(stAddress);
				
				Label label1= new Label (contestant1);
				System.out.print("\n"+label1);
				System.out.print("\n" + "Do you wish to add another entry?(y/n)");
				String choice = scan.nextLine();
				if (choice == "y"){
				    entry = true;
				    }
			}
			while (entry);
			
	}

}