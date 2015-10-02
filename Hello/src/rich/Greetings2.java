package rich;
import java.util.Calendar;
import java.util.Scanner;
public class Greetings2 {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter your first name: ");
	String firstname = scan.nextLine();
	System.out.print("Enter your last name: ");
	String lastName = scan.nextLine();
	System.out.println("Hello "+ firstname + " "+ lastName);
	System.out.println("Welcome to Java!");
	int year = Calendar.getInstance().get(Calendar.YEAR);
	System.out.println(year);

			
}

}
