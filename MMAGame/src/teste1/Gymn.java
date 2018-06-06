package teste1;

public class Gymn {
	
	public static void trainKickboxing(Fighter fighter, int points){
		fighter.strikingLv = fighter.strikingLv + points;
		fighter.fitness = fighter.fitness + 1;
        System.out.println(fighter.name + "'striking Lv is now " + fighter.strikingLv);
        System.out.println(fighter.name + "'s fitness Lv is now " + fighter.fitness);

	}
	
	public static void trainWrestling(Fighter fighter,int points){
		fighter.clinchLv = fighter.clinchLv + points;
		fighter.fitness = fighter.fitness + 1;
        System.out.println(fighter.name + "'s clinchwork Lv is now " + fighter.clinchLv);
        System.out.println(fighter.name + "'s fitness Lv is now " + fighter.fitness);
		
	}
	
	public static void trainJiuJitsu(Fighter fighter, int points){
		fighter.grapplingLv = fighter.grapplingLv + points;
		fighter.fitness = fighter.fitness + 1;
        System.out.println(fighter.name + "'s grappling Lv is now " + fighter.grapplingLv);
        System.out.println(fighter.name + "'s fitness Lv is now " + fighter.fitness);
		
	}
	
	public static void trainHITT(Fighter fighter,int points){
		fighter.fitness = fighter.fitness + points*2;
        System.out.println(fighter.name + "'s fitness Lv is now " + fighter.fitness);
		
	}
	
	public static void StandupSparring(Fighter fighterA, Fighter fighterB){

		int performanceA =  (fighterA.strikingLv + Randomizer.getRandomNumberInRange(0,5));
		int performanceB =  (fighterA.strikingLv + Randomizer.getRandomNumberInRange(0,5));
		int result = performanceA - performanceB;
		System.out.println(fighterA.name + " sparring performance = " + performanceA);
		System.out.println(fighterB.name + " sparring performance = " + performanceB);
		
		
		
		if ( result > 1){
			System.out.println(fighterA.name + " shows technical superiority/.");
			
		} else if (result < -1){
			System.out.println(fighterB.name + " shows technical superiority/");
		} else {
			System.out.println("The fighters are well matched.");
		}
	
	}
}

	