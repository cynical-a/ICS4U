import java.util.Scanner;

/**
 * 
 */

/**
 * @author 324115906
 *
 */
public class contestantMain {

	/**
	 * @param args
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome to probably one of the lamest gameshows to date!"+"\n" + "It appears you wish to be on the show."+"\n" + "To get on the show, you will have to fill out a small form as well as answer a skill testing question."+"\n"+"\n"+"\n");
		

		System.out.print("Enter your first name: ");
		String fName = scan.nextLine();
		
		System.out.print("Enter your last name: ");
		String lName = scan.nextLine();
		
		System.out.print("Enter your birthdate in DD/MM/YYYY format: ");
		String bDay = scan.nextLine();
		
		if (Character.isDigit(bDay.charAt(0)) == false){
			throw new InvalidInputException("Birth Day must be in DD/MM/YYYY format ");
		}

		System.out.print("Enter your Province ");
		String p = scan.nextLine();
		
		System.out.print("Enter your city ");
		String c = scan.nextLine();
		
		System.out.print("Enter your street address ");
		String stAddress = scan.nextLine();

		System.out.print("Enter your postal code (X#x#x# format) ");
		String postCode = scan.nextLine();
		
		System.out.print("Enter your phonenumber without spaces (Eg 416XXXXXXX) ");
		String pNumber = scan.nextLine();
		if (Character.isDigit(pNumber.charAt(0)) == false){
			throw new InvalidInputException("Phone numbers must not include letters");
		}
		
		ContestantInformation contestant1 = new ContestantInformation();
		contestant1.setFirstName(fName);
		contestant1.setlastName(lName);
		contestant1.setbirthDate(bDay);
		contestant1.setcity(c);
		contestant1.setprovince(p);
		contestant1.setstreetAddress(stAddress);
		contestant1.setpostalCode(postCode);
		contestant1.setphoneNumber(pNumber);
		
		System.out.print(contestant1.toString());

	}
	

}
