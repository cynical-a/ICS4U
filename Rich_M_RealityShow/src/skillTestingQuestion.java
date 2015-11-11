import java.util.Random;
import java.util.Scanner;


/**
 * @author 324115906
 *
 */
public class skillTestingQuestion {
	
	public static void skillQuestion(){
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);	
	Random rand = new Random();
    int valueA = rand.nextInt(9);
    int valueB = rand.nextInt(9);
    int valueC = rand.nextInt(9);
    @SuppressWarnings("unused")
	int answer = valueA + valueB * valueC;
    
    System.out.println ("Answer the following question correctly: \n");
    System.out.println ( valueA + " + "+ valueB +" x "+valueC);
	@SuppressWarnings("unused")
	String response = scan.nextLine();
	}

}
