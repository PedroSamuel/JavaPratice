package teste1;
//import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class Randomizer {
	public static int getRandomNumberInRange(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max + 1)).findFirst().getAsInt();
	}
}
