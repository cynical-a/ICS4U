import java.util.Random;

public class skillTestingQuestion {
	public String generateQuestion(){
		Random rand = new Random();
		int value1 = rand.nextInt(21);
		int value2 = rand.nextInt(21);
		int value3 = rand.nextInt(21);
		String question = value1 +"+"+ value2 +"*"+value3; 
		int answer = value1 + value2 * value3;
		return question + answer;
	}
}
