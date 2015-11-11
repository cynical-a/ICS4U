import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * @author M Rich
 */
public class contestantMain {

	static ArrayList<ContestantInformation> contestants;

	/**
	 * @throws InvalidInputException 
	 */
	static String password = "password";
	public static void addContestants(ArrayList<ContestantInformation> contestants )throws InvalidInputException{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();

		System.out.print("Welcome to probably one of the lamest gameshows to date!"+"\n" + "It appears you wish to be on the show."+"\n" + "To get on the show, you will have to fill out a small form as well as answer a skill testing question."+"\n"+"\n"+"\n");		
		System.out.print("Enter your first name: ");
		String fName = scan.nextLine();

		System.out.print("Enter your last name: ");
		String lName = scan.nextLine();

		do{
			flag = false;
			System.out.print("Enter your year of birth");
			String bYear = scan.nextLine();
			System.out.print("Enter your month of birth");
			String bMonth = scan.nextLine();
			try {
				contestant1.setbirthYear(bYear);
				contestant1.setbirthMonth(bMonth);
			}
			catch(InvalidInputException e){
				System.out.println(e.getMessage());
				flag = true;
			}
		}
		while (flag);

		System.out.print("Enter your street address ");
		String stAddress = scan.nextLine();

		System.out.print("Enter your city ");
		String c = scan.nextLine();
		flag = false;
		String p;
		do{
			System.out.print("Enter your Province ");
			p = scan.nextLine();
			if (p.equalsIgnoreCase( "Manitoba")||p.equalsIgnoreCase("mb")){
				p = "MB";     
				flag = false;
			}
			else if (p.equalsIgnoreCase( "British Columbia")||p.equalsIgnoreCase("bc")){
				p = "BC";     
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Ontario")||p.equalsIgnoreCase("on")){
				p = "ON";    
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Sasakatchewan")||p.equalsIgnoreCase("sk")){
				p = "SK";     
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Quebec")||p.equalsIgnoreCase("qc")){
				p = "QC";     
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Yukon")||p.equalsIgnoreCase("yt")){
				p = "YT";     
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Prince Edsward Island")||p.equalsIgnoreCase("pei")||p.equalsIgnoreCase("pe")){
				p = "PE";      
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Alberta")||p.equalsIgnoreCase("ab")){
				p = "AB";
				flag = false;
			}
			else if (p.equalsIgnoreCase( "New Brunswick")||p.equalsIgnoreCase("nb")){
				p = "NB";     
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Nunavut")||p.equalsIgnoreCase("Nu")){
				p = "NU";        
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Northwest Territories")||p.equalsIgnoreCase("nt")){
				p = "NT"; 
				flag = false;
			}
			else if (p.equalsIgnoreCase( "Newfoundland and Labrador")||p.equalsIgnoreCase("nl")||p.equalsIgnoreCase("Newfoundland")||p.equalsIgnoreCase("Labrador")){
				p = "NL";    
				flag = false;                            
			}
			else if (p.equalsIgnoreCase( "Nova Scotia")||p.equalsIgnoreCase("ns")){
				p = "NS";             
				flag = false;
			}
			else{
				System.out.println("That is not a valid province or territory.");
				flag = true;
			}
		}while (flag);



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
				System.out.println("The file is either corrupt.");
				flag = true;
			}
		}
		while (flag);


		Random rand = new Random();
		int valueA = rand.nextInt(9);
		int valueB = rand.nextInt(9);
		int valueC = rand.nextInt(9);
		int answer = valueA + valueB * valueC;
		int tries = 2;
		System.out.println("You will have a total of 3 tries.\n");

		do{
			if (tries <= 0){
				System.out.println("You do not have any more tries left.\n");
				break;
			}
			System.out.println("Answer the following question correctly: \n");
			System.out.println(+ valueA + " + "+ valueB +" x "+valueC);
			String response = scan.nextLine();
			int convertedResponse = Integer.parseInt(response);
			if (convertedResponse == answer){
				contestant1.setFirstName(fName);
				contestant1.setlastName(lName);

				contestant1.setcity(c);

				contestant1.setprovince(p);
				contestant1.setstreetAddress(stAddress);
				contestants.add(contestant1);

				Collections.sort(contestants);
				System.out.print(contestant1.getfirstName()+" was added successfully"+"\n"+"\n");
				flag = false;
				break;
			}
			else{
				if (tries > 1);{
					System.out.println("You are incorrect.\n You have "+ tries + " tries remaining");
				}
				flag = true;
				tries -= 1; 
			}
		}
		while (flag = true);

	}

	public static void searchContestants()
	{
		boolean flag = true;
		do{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first name of a person you would like to search,\n 'X' to return to the main menu");
			String fName = scan.nextLine();
			ContestantInformation temp = new ContestantInformation();
			temp.setFirstName(fName);
			System.out.println("Enter the last name of a person you would like to search,\n 'X' to return to the main menu");
			String lName = scan.nextLine();
			temp.setlastName(lName);
			if (fName.equalsIgnoreCase("x")|| lName.equalsIgnoreCase("x")){
				flag = false;
			}

			int isHere = Search.linearSearch(temp, contestants);
			if (isHere ==-1){
				System.out.println("The contestant you searched for is nonexistant.");
			}

			else{
				System.out.print("Contestant found at " +  isHere + "\n Would you like to print out "+ temp.getfirstName()+ "'s information?");
				String printIt = scan.nextLine();
				if (printIt.equalsIgnoreCase("y")){
					Label searchResult = new Label (contestants.get(isHere));
					System.out.print(searchResult.toString());

				}         
			}
		}while(flag);
	}
	public static void deleteContestant(){
		boolean flag = true;
		do{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first name of a person you wish to delete,\n 'X' to return to the main menu");
			String fName = scan.nextLine();
			ContestantInformation temp = new ContestantInformation();
			temp.setFirstName(fName);
			if (fName.equalsIgnoreCase("x")){
				break;
			}
			System.out.println("Enter the last name of a person you wish to delete,\n 'X' to return to the main menu");
			String lName = scan.nextLine();
			temp.setlastName(lName);
			if (lName.equalsIgnoreCase("x")){
				break;
			}

			int isHere = Search.linearSearch(temp, contestants);
			if (isHere ==-1){
				System.out.println("The contestant you searched for is nonexistant.");
			}

			else{
				System.out.print("Contestant found at " +  isHere + "\n Are you sure you wish to delete "+ temp.getfirstName()+ "from the list?");
				String printIt = scan.nextLine();
				if (printIt.equalsIgnoreCase("y")){
					contestants.remove(isHere);
					System.out.print("The contestant's information has been deleted.");

				}         
			}
		}while(flag);
	}
	public static void deleteAll(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Are you sure you wish to permanently delete all contestants? (Y/N)");
		String decision = scan.nextLine();
		if (decision.equalsIgnoreCase("y")){
			contestants.removeAll(contestants);
			System.out.print("All contestants have been deleted");
		}
		if (decision.equalsIgnoreCase("n")){
			System.out.print("\n");
			return;
		}

	}
	public static void save() throws FileNotFoundException{
		FileOutputStream fileOutputStream = new FileOutputStream("src\\contestantList.txt");
		PrintStream fpStream = new PrintStream(fileOutputStream);
		int totalContestants = contestants.size();

		fpStream.println(totalContestants);

		for (int i = 0; i < totalContestants; i++){
			fpStream.println(contestants.get(i).getfirstName());
			fpStream.println(contestants.get(i).getlastName());
			fpStream.println(contestants.get(i).getphoneNumber());
			fpStream.println(contestants.get(i).getpostalCode());
			fpStream.println(contestants.get(i).getstreetAddress());
			fpStream.println(contestants.get(i).getcity());
			fpStream.println(contestants.get(i).getprovince());
		}
		fpStream.close();
	}
	public static void load() throws InvalidInputException{
		BufferedReader bReader;
		try {
			bReader = new BufferedReader(new FileReader("src\\contestantList.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			bReader = new BufferedReader(new FileReader("src\\contestantList.txt"));
			int totalContestants = Integer.parseInt(bReader.readLine());
			for (int i = 0; i < totalContestants; i++){
				ContestantInformation contestant1 = new ContestantInformation();
				String firstName = bReader.readLine();
				String lastName = bReader.readLine();
				String phoneNumber = bReader.readLine();
				String postalCode = bReader.readLine();
				String streetAddress = bReader.readLine();
				String city = bReader.readLine();
				String province = bReader.readLine();
				contestant1.setFirstName(firstName);
				contestant1.setlastName(lastName);
				contestant1.setcity(city);
				contestant1.setprovince(province);
				contestant1.setstreetAddress(streetAddress);
				contestant1.setphoneNumber(phoneNumber);
				contestant1.setpostalCode(postalCode);
				contestants.add(contestant1);
				Collections.sort(contestants);

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void printAll(){
		int totalContestants = contestants.size();
		for (int i = 0; i < totalContestants; i++){
			Label contestantLabel = new Label (contestants.get(i));
			System.out.println(contestantLabel);
		}

	}
	public static void pickWinner(){
		Random rand = new Random();

		if (contestants.size() == 0){
			System.out.println("There are no contestants to pick from.\n");
		}
		else{
			int winner = rand.nextInt(contestants.size());
			Label winnerInfo = new Label (contestants.get(winner));
			System.out.print("The contestant chosen was"+(contestants.get(winner).getfirstName())+"\n Their information is: \n" + winnerInfo);
		}
	}
	@SuppressWarnings("resource")

	public static void changePassword() throws FileNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream("src\\adminPassword.txt");
		PrintStream fpStream = new PrintStream(fileOutputStream);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new password: \n");
		String newPassword = scan.nextLine();
		System.out.println("Re-enter a the new password: \n");
		String rePassword = scan.nextLine();
		if (rePassword.equals(newPassword)){
			fpStream.println(newPassword);
			fpStream.close();
			System.out.println("Password has been reset");

		}
		else{
			System.out.println("The passwords do not match, the password was not set.");
		}
	}
	public static void adminMenu() throws FileNotFoundException, InvalidInputException  {

		Scanner scan = new Scanner(System.in);
		BufferedReader bReader = null;

		System.out.println("If not set already, the password will be 'password'");
		try{
			bReader = new BufferedReader(new FileReader("src\\adminPassword.txt"));
			password = bReader.readLine();

			int tries = 3;
			boolean flag = true;
			do{
				if (tries <= 0){

					System.out.println("You do not have any more tries left.");
					break;
				}
				System.out.println("Enter the Admin Password: \n");
				String userGuess = scan.nextLine();
				if (userGuess.equals(password)){
					String adminChoice = "1";
					do{
						System.out.println("Choose an option");
						System.out.print("1. Delete a contestant"+"\n"+"2.Delete all contestants"+"\n"+"3. Load from file"+"\n"+ "4. Save to file"+"\n"+"5. Change Password"+"\n 6 Print All."+"\n 7 Generate a Winner"+"\n 8. Return to the main menu.");
						adminChoice = scan.nextLine();
						if (adminChoice.equals("1") ){
							deleteContestant();
						}
						if (adminChoice.equals("2")){
							deleteAll();
						}
						if (adminChoice.equals("3")){
							load();
						}
						if (adminChoice.equals("4")){
							save();
						}
						if (adminChoice.equals("5")){
							changePassword();
						}
						if (adminChoice.equals("6")){
							printAll();
						}
						if (adminChoice.equals("7")){
							pickWinner();
						}
						if (adminChoice.equals("8")){
							System.out.println("\n");
							flag = false;
						}


					} while(adminChoice.equals("8")== false);

				}
				else{
					System.out.println("The password is incorrect.\n You have "+ tries + "more attempts left.");
					System.out.println(password);
					tries = tries - 1;
				}
			}while(flag);

		}catch(FileNotFoundException e){
			System.out.println("Sorry the file was not found");
			password = "password";
		}
		catch(IOException e){
			System.out.println("The file cannot be read");
		}

	}

	//==========================================================================================
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidInputException, IOException {
		Scanner scan = new Scanner(System.in);	
		contestants = new	ArrayList<ContestantInformation>();
		String menuChoice;
		do{
			menuChoice = "1";
			System.out.println("Choose an option");
			System.out.print("1. Add new contestant"+"\n"+"2. Search"+"\n"+"3. Load from file"+"\n"+ "4. Save to file"+"\n"+"5. Administraton Tools"+"\n6. Terminate Program");
			menuChoice = scan.nextLine();

			if (menuChoice.equals("1") ){
				addContestants(contestants);
			}
			if (menuChoice.equals("2")){
				searchContestants();
			}
			if (menuChoice.equals("3")){
				load();
			}
			if (menuChoice.equals("4")){
				save();
			}
			if (menuChoice.equals("5")){
				adminMenu();
				//	deleteAll();
			}
		}while(menuChoice !="8");
	}
}






