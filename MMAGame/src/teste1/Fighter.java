package teste1;

public class Fighter {
	private String name;
	private String nacionality;
	private int strikingLv;
	private int wrestlingLv;
	private int grapplingLv;
	private int fitness;
	private int wins;
	private int losses;
	private int draws;
	
	///////////   CONSTRUCTORS      ////////////////
	public Fighter(String name, String nacionality){
		this.setName(name);
		this.setNacionality(nacionality);
		this.setStrikingLv(5 + (int)Math.random()*15);
		this.setWrestlingLv(5 + (int)Math.random()*15);
		this.setGrapplingLv(5 + (int)Math.random()*15);
		this.setWins(0); 
		this.setLosses(0);
		this.setDraws(0);
		
	}
	
	public Fighter(
			String name,
			String nacionality,
			int strikingLv,
			int wrestlingLv,
			int grapplingLv,
			int fitness,
			int wins,
			int losses,
			int draws
			) {
		super();
		this.setName(name);
		this.setNacionality(nacionality);
		this.setStrikingLv(strikingLv);
		this.wrestlingLv = wrestlingLv;
		this.grapplingLv = grapplingLv;
		this.setFitness(fitness);
		this.setWins(wins);
		this.setLosses(losses);
		this.setDraws(draws);
	}
	
	


	
	
	
	
	//getters  e setters
	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getStrikingLv() {
		return strikingLv;
	}
	
	public void setStrikingLv(int strikingLv) {
		this.strikingLv = strikingLv;
	}

	public int getWrestlingLv() {
		return wrestlingLv;
	}

	public void setWrestlingLv(int wrestlingLv) {
		this.wrestlingLv = wrestlingLv;
	}

	public int getGrapplingLv() {
		return grapplingLv;
	}

	public void setGrapplingLv(int grapplingLv) {
		this.grapplingLv = grapplingLv;
	}

	public int getFitness() {
		return fitness;
	}

	public void setFitness(int fitness) {
		this.fitness = fitness;
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setStats(int strike, int wrestling, int grapple, int fit){
		this.strikingLv = strike;
		this.wrestlingLv = wrestling;
		this.grapplingLv = grapple;
		this.fitness = fit;
	}
	

	
	public void checkStats(){
		System.out.println(this.name + " is ready to fight!");
        System.out.println("Striking Lv : " + this.strikingLv);
        System.out.println("Wrestling Lv : " + this.wrestlingLv);
        System.out.println("Grappling Lv : " + this.grapplingLv);
        System.out.println("Fitness Lv :" + this.fitness);
        
		
	}
	
	
}
