package teste1;

public class StandupFight {
	
	public static void KickboxingMatch(Fighter fighterA, Fighter fighterB){
		
		int fighterAHealth = 12;
		int fighterBHealth = 12;
		int knockout = 0;
		for (int round = 0; round <= 5; round++){
			while (fighterAHealth > 0 || fighterBHealth > 0){
				System.out.println("Round " + round + " starts!");
				
				int performanceA =  (fighterA.strikingLv + Randomizer.getRandomNumberInRange(0,5));
				int performanceB =  (fighterA.strikingLv + Randomizer.getRandomNumberInRange(0,5));
				int roundresult = performanceA - performanceB;
				System.out.println(fighterA.name + " sparring performance = " + performanceA);
				System.out.println(fighterB.name + " sparring performance = " + performanceB);
				
				
				if (roundresult > 5){
					knockout = 1;
					fighterBHealth = 0;
					
				} else if (roundresult > 1) {
					fighterBHealth = fighterBHealth - 4;
					fighterAHealth = fighterAHealth - 1;
				} else if (roundresult > -2 ){
					fighterBHealth = fighterBHealth - 2;
					fighterAHealth = fighterAHealth - 2;
				} else if (roundresult > -5){
					fighterBHealth = fighterAHealth - 4;
					fighterAHealth = fighterBHealth - 1;
				} else {
					knockout = 2;
					fighterAHealth = 0;
	
				}
			}
			int lastround = round;

		}
	}
}
