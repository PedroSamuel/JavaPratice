package teste1;

public class Fighter {
	public String name;
	public int strikingLv = 0;
	public int clinchLv = 0;
	public int grapplingLv = 0;
	public int fitness = 0;

	public void setName(String name){
		this.name = name;
	}
	
	public void setStats(int strike, int clinch, int grapple, int fit){
		this.strikingLv = strike;
		this.clinchLv = clinch;
		this.grapplingLv = grapple;
		this.fitness = fit;
	}
	

	
	public void checkStats(){
		System.out.println(this.name + " is ready to fight!");
        System.out.println("Striking Lv : " + this.strikingLv);
        System.out.println("Clinchwork Lv : " + this.clinchLv);
        System.out.println("Grappling Lv : " + this.grapplingLv);
        System.out.println("Fitness Lv :" + this.fitness);
		
	}
	
	
}
