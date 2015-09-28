/**
 * 
 */

/**
 * @author 324115906
 *
 */
public class Label {

	/**
	 * @param args
	 */
	private ContestantInformation ci1;
	
	public Label (ContestantInformation ci){
		this.ci1 = ci;
	}
	
	private String formatName(){
		String name = ci1.getlastName() + ", "+ ci1.getfirstName()+ "/n";
		return name;
	}
	private String formatAddress(){
		String Address0 = ci1.getstreetAddress() + "/n";
		String Address1 = ci1.getcity() +", "+ ci1.getprovince() + "/n";
		String Address2 = ci1.getpostalCode();
		return Address0+Address1+Address2;
	}
	private String formatPhoneNumber(){
		String phoneNum = ci1.getphoneNumber() + "/n";
		String phoneFormat = "("+ phoneNum.charAt(0) + phoneNum.charAt(1) + phoneNum.charAt(2)+") "+phoneNum.charAt(3)+phoneNum.charAt(4)+ phoneNum.charAt(5)+"-"+phoneNum.charAt(6)+phoneNum.charAt(7)+phoneNum.charAt(8)+phoneNum.charAt(9);
	    return phoneFormat;
	}

	public String toString(){
		return formatName() + 	formatAddress()+ formatPhoneNumber();
	}
}
