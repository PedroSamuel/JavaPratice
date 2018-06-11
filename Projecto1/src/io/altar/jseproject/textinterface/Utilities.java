package io.altar.jseproject.textinterface;

public class Utilities {
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
}