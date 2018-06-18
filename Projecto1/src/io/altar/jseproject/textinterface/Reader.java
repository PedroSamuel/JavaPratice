package io.altar.jseproject.textinterface;
import java.util.Scanner;
public interface Reader {
		Scanner scan = new Scanner(System.in);
		
	public static String read(){

		String read = scan.nextLine();
	return read;
	}
	
	public static int readInt(){
	return toInt(read(), 6);
	}
	
	public static double readDouble(){

	return toDouble(read(), 0);
	}
	
	
	public static int toInt(String number, int defaultVal) {
		try {
			return Integer.parseInt(number);
		} catch (NumberFormatException e) {
			 return defaultVal;
		}
	}
		
	
	public static double toDouble(String number, double defaultVal){
		try {
		return Double.parseDouble(number);
		} catch (NumberFormatException e) {
		return defaultVal;
		}
	}
	
	public static int readfromChoices(int choices[], int defaultVal){
		int input = readInt();
		for (int element : choices) {
			if (element == input) {
				return element;
			}
		}
		return defaultVal;
	}
	
}

	