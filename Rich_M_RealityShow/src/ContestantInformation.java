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
public class ContestantInformation {
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
	private String birthDate;
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH);
	int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	/**_______________________________________________________________________________
	 * =================================================I forgot the word for this one
	 * @throws InvalidInputException 
	 */
	
	public ContestantInformation(String fName, String lName, String stAddress, String c, String p, String postCode, String pNumber, String bDay) throws InvalidInputException
	{ 
		this.setFirstName(fName);
		this.setlastName(lName);
		this.setstreetAddress(stAddress);
		this.setcity(c);
		this.setprovince(p);
		this.setpostalCode(postCode);
		this.setphoneNumber(pNumber);
		this.setbirthDate(bDay);
	}
	
	public ContestantInformation()
	{
		
	}
	
	/**_______________________________________________________________________________
	 * =====================================================================Set things
	 */
	
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
		if (postalCode.length() != 6 ||Character.isDigit(postalCode.charAt(0))||Character.isDigit(postalCode.charAt(2))|| Character.isDigit(postalCode.charAt(4))==false||Character.isDigit(postalCode.charAt(1)) == false||Character.isDigit(postalCode.charAt(3))== false || Character.isDigit(postalCode.charAt(5))==false)
		{
			throw new InvalidInputException("Postal code must be 6 digits in correct alphanumeric order (X#X#X#).");
		}
		this.postalCode = postCode;
	}
	public void setphoneNumber(String pNumber) throws InvalidInputException{
		if (phoneNumber.length() > 10||phoneNumber.length() < 10)
		{
			throw new InvalidInputException("Phone number must be 10 digits.");
		}
		this.phoneNumber = pNumber;
	}
	public void setbirthDate(String bDay){
		this.birthDate = bDay;
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
	/**
	 * @return Returns the birth date
	 * @throws InvalidInputException 
	 */
	public String getbirthDate() throws InvalidInputException{
		if ((year-birthDate.charAt(2))< 18|| (month <= birthDate.charAt(1)))
			{if (birthDate.charAt(0) > day && month == birthDate.charAt(1))
			{
				throw new InvalidInputException("Contestant is too young.");
			}
			throw new InvalidInputException("Contestant is too young.");

			}
		return this.birthDate;
	}
	
	
	public String toString(){
		return firstName + " " + lastName + " " + streetAddress + " " + city + " " + province + " " + postalCode + " " + phoneNumber + " " + birthDate;
	}
}




