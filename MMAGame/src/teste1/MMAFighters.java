package teste1;
//import java.util.concurrent.ThreadLocalRandom;


public class MMAFighters {
	
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter Fighter1 = new Fighter();
		//Fighter1.setName("Jason");
		//Fighter1.setStats(8, 4, 3, 5);
		Gymn.trainKickboxing(Fighter1, 3);
		//Fighter1.trainHITT(2);
		//Fighter1.checkStats();
		
		Fighter Fighter2 = new Fighter();
		//Fighter2.setName("Tyron");
		//Fighter2.setStats(6, 5, 5, 6);
		//Fighter2.trainWrestling(3);
		//Fighter2.trainJiuJitsu(2);
		//Fighter2.checkStats();
	
		Gymn.StandupSparring(Fighter1, Fighter2);
		
	}	

	

}
