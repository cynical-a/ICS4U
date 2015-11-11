import java.util.Calendar;
/**
 * This class holds information of each contestant.
 * Each set of fields include:
 * First name, last name
 * Street address, city, province
 * postal code, phone number
 * and birth date 
 * @author Meranda Rich
 */
@SuppressWarnings("rawtypes")
public class ContestantInformation implements Comparable{
	/**_______________________________________________________________________________
	 * ==================================================================Set variables
	 */
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String province; 
	private String postalCode;
	private String phoneNumber;
	private int birthYear;
	private int birthMonth;
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH);
	int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	/**	
	 * @throws InvalidInputException 
	 */

	public  ContestantInformation(String fName, String lName, String stAddress, String c, String p, String postCode, String pNumber, String bYear, String bMonth) throws InvalidInputException
	{ 
		this.setFirstName(fName);
		this.setlastName(lName);
		this.setstreetAddress(stAddress);
		this.setcity(c);
		this.setprovince(p);
		this.setpostalCode(postCode);
		this.setphoneNumber(pNumber);
		this.setbirthYear(bYear);
		this.setbirthMonth(bMonth);
	}

	public ContestantInformation()
	{

	}


	public void setFirstName(String fName){
		this.firstName = fName;
	}
	public void setlastName(String lName){
		this.lastName = lName;
	}
	public void setstreetAddress(String stAddress){
		this.streetAddress = stAddress;
	}
	public void setcity(String c){
		this.city= c;
	}
	public void setprovince(String p){
		this.province = p;
	}
	public void setpostalCode(String postCode) throws InvalidInputException{
		if (postCode.length() != 6 ||Character.isDigit(postCode.charAt(0))||Character.isDigit(postCode.charAt(2))|| Character.isDigit(postCode.charAt(4))||Character.isDigit(postCode.charAt(1)) == false||Character.isDigit(postCode.charAt(3))== false || Character.isDigit(postCode.charAt(5))==false){
			throw new InvalidInputException("Postal code must be 6 digits in correct alphanumeric order (X#X#X#).");
		}
		this.postalCode = postCode;
	}
	public void setphoneNumber(String pNumber) throws InvalidInputException{
		if (pNumber.length() > 10||pNumber.length() < 10)
		{
			throw new InvalidInputException("Phone number must be 10 digits.");
		}
		//		else if(Character.isDigit(pNumber) == false){
		//			throw new InvalidInputException("Phone number cannot include letters");
		//		}
		this.phoneNumber = pNumber;
	}

	/**
	 * @return Returns the first name
	 */
	public String getfirstName(){

		return this.firstName;
	}
	
	/**
	 * @return Returns the last name  
	 */	
	public String getlastName(){

		return this.lastName;
	}
	
	/**
	 * @return Returns the street address
	 */
	public String getstreetAddress(){

		return this.streetAddress;
	}

	/**
	 * @return Returns the city
	 */
	public String getcity(){

		return this.city;
	}	
	
	/**
	 * @return Returns the province
	 */
	public String getprovince(){

		return this.province;
	}
	
	/**
	 * @return Returns the postal code
	 * @throws InvalidInputException 
	 */
	public String getpostalCode(){
		return this.postalCode;
	}
	
	/**
	 * @return Returns the phone number
	 * @throws InvalidInputException 
	 */
	public String getphoneNumber() {
		return this.phoneNumber;
	}
	public void setbirthYear(String bYear)throws InvalidInputException{
		int ageYear = (year - Integer.parseInt (bYear));
		if (ageYear < 18 )
		{
			throw new InvalidInputException("You are too young.");
		}
		this.birthYear = Integer.parseInt(bYear);
	}
	public void setbirthMonth(String bMonth){
		if (bMonth.equalsIgnoreCase("1")||bMonth.equalsIgnoreCase("jan")||bMonth.equalsIgnoreCase("January")){
			this.birthMonth = 1;
		}
		else if (bMonth.equalsIgnoreCase("2")||bMonth.equalsIgnoreCase("feb")||bMonth.equalsIgnoreCase("febuary")){
			this.birthMonth = 2;
		}
		else if (bMonth.equalsIgnoreCase("3")||bMonth.equalsIgnoreCase("mar")||bMonth.equalsIgnoreCase("march")){
			this.birthMonth = 3;
		}
		else if (bMonth.equalsIgnoreCase("4")||bMonth.equalsIgnoreCase("Apr")||bMonth.equalsIgnoreCase("april")){
			this.birthMonth = 4;
		}
		else if (bMonth.equalsIgnoreCase("5")||bMonth.equalsIgnoreCase("may")){
			this.birthMonth = 5;
		}
		else if (bMonth.equalsIgnoreCase("6")||bMonth.equalsIgnoreCase("jun")||bMonth.equalsIgnoreCase("june")){
			this.birthMonth = 6;
		}
		else if (bMonth.equalsIgnoreCase("7")||bMonth.equalsIgnoreCase("jul")||bMonth.equalsIgnoreCase("july")){
			this.birthMonth = 7;
		}
		else if (bMonth.equalsIgnoreCase("8")||bMonth.equalsIgnoreCase("aug")||bMonth.equalsIgnoreCase("august")){
			this.birthMonth = 8;
		}
		else if (bMonth.equalsIgnoreCase("9")||bMonth.equalsIgnoreCase("sept")||bMonth.equalsIgnoreCase("sep")||bMonth.equalsIgnoreCase("september")){
			this.birthMonth = 9;
		}
		else if (bMonth.equalsIgnoreCase("10")||bMonth.equalsIgnoreCase("oct")||bMonth.equalsIgnoreCase("october")){
			this.birthMonth = 10;
		}
		else if (bMonth.equalsIgnoreCase("11")||bMonth.equalsIgnoreCase("nov")||bMonth.equalsIgnoreCase("november")){
			this.birthMonth = 11;
		}
		else if (bMonth.equalsIgnoreCase("12")||bMonth.equalsIgnoreCase("dec")||bMonth.equalsIgnoreCase("december")){
			this.birthMonth = 12;
		}
		else {
			System.out.println("The month is invalid");
		}
	}
	/**
	 * @return Returns the birth date
	 * @throws InvalidInputException 
	 */
	public int getbirthYear() {
		return 0;
	}

	public boolean equalsIgnoreCase(ContestantInformation x) {
		if (x.getfirstName().equalsIgnoreCase(this.firstName) && x.getlastName().equalsIgnoreCase(this.lastName)){
			return true;
		}
		else{
			return false;
		}
	}
	public int compareToIgnoreCase(ContestantInformation x) {
		if (x.getfirstName().equalsIgnoreCase(this.firstName) && x.getlastName().equalsIgnoreCase(this.lastName)){
			return 0;
		}
		else{
			return 1;
		}
	}

	@Override
	public int compareTo(Object arg0) {

		return 0;
	}
}




