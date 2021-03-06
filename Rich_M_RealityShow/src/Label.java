/**
 * 
 */

/**
 * @author Rich
 *
 */
public class Label {


	private ContestantInformation ci1;
	
	/**
	 * 
	 * @param ci ContestantInformation object
	 */
	public Label (ContestantInformation ci){
		this.ci1 = ci;
	}
/**
 * 
 * @return
 */
	private String formatName(){
		String name = ci1.getlastName() + ", "+ ci1.getfirstName()+ "\n";
		return name;
	}
	/**
	 * 
	 * @return
	 */
	private String formatAddress(){
		String Address0 = ci1.getstreetAddress() + "\n";
		String Address1 = ci1.getcity() +", "+ ci1.getprovince() + "\n";
		String Address2 = ci1.getpostalCode()+" ";
		return Address0+Address1+Address2;
	}
	/**
	 * 
	 * @return
	 */
	private String formatPhoneNumber(){
		String phoneNum = ci1.getphoneNumber();
		String phoneFormat = "("+ phoneNum.charAt(0) + phoneNum.charAt(1) + phoneNum.charAt(2)+") "+phoneNum.charAt(3)+phoneNum.charAt(4)+ phoneNum.charAt(5)+"-"+phoneNum.charAt(6)+phoneNum.charAt(7)+phoneNum.charAt(8)+phoneNum.charAt(9) + "\n";
	    return phoneFormat;
	}
/**
 * @return returns the formatted Name, Address and phone number
 */
	public String toString(){
		return formatName() + 	formatAddress()+ formatPhoneNumber();
	}
}
