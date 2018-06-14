import java.util.ArrayList;
import java.util.Scanner;


public class Exercicios {
	public static ArrayList<Human> humanList = new ArrayList<Human>(0);
	public static ArrayList<Dog> dogList = new ArrayList<Dog>(0);
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//createHumans();
		
		Human eva = new Human(1,"Eva",37,'f');
		humanList.add(eva);
		Human pedro = new Human(2,"Pedro", 29,'m');
		humanList.add(pedro);
		showHumans();
		createDogs();
		showDogs();
		showHumans();
		}

	
	private static void 	createHuman(){
		
		String nome;
		int idade;
		char sexo;

		System.out.println("Introduza o nome do novo humano.");
		nome = sc.nextLine();
		System.out.printf("Introduza a idade de %s. \n", nome);
		idade = sc.nextInt();
		System.out.printf("Introduza o sexo de %s. \n", nome);
		sexo = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("");
		Human newHuman = new Human((humanList.size() + 1), nome, idade, sexo);
		humanList.add(newHuman);
	}
	
	public static void createHumans(){
		//boolean stop = false;
		String reply;
			do {
			createHuman();
			System.out.println("Deseja criar mais humanos (s/n)");
			reply = sc.nextLine();
			System.out.println(reply);
			
			} while(!(reply.equals("n")));
		
	}
	
	
	public static void showHumans(){
		System.out.println("### Mostrando Humanos ###");
		System.out.println("");
		for (int i = 0; i < humanList.size(); i++){
			humanList.get(i).showStatus();
		}
		System.out.println("##########################");		

			
	}
	
	public static void showDogs(){
		System.out.println("**** Mostrando Cåes *****");
		System.out.println("");
		for (int i =0;i < dogList.size(); i++){
			dogList.get(i).showStatus();
		}
		System.out.println("************************");
	}
	
	
	
	private static void 	createDog(){
		
		String nome;
		int idade;
		char sexo;
		String raça;
		//String dono;
		//boolean validDono = false;
		

		System.out.println("Introduza o nome do novo Cåo.");
		nome = sc.nextLine();
		System.out.printf("Introduza a idade de %s. \n", nome);
		idade = sc.nextInt();
		System.out.printf("Introduza o sexo de %s. \n", nome);
		sexo = sc.next().charAt(0);
		sc.nextLine();
		System.out.printf("Introduza a raça de %s.\n", nome);
		raça = sc.nextLine();
		
		System.out.println("");
		Dog newDog = new Dog((dogList.size() + 1), nome, idade, sexo, raça);	

		System.out.printf("%s tem dono? (s/n) \n", nome);
		if (sc.nextLine().equals("s")){
			attributeOwner(newDog);
			dogList.add(newDog);
		}
		
	}
	
	private static Dog attributeOwner(Dog dog){
		boolean validDono = false;
		
		
		while (validDono == false){
				String dono;
				System.out.printf("Quem e o dono de %s? \n", dog.getNome());
				dono = sc.nextLine();
				for (int i= 0; i < humanList.size(); i++){
					if (humanList.get(i).getNome().equals(dono)){
						dog.setOwner(humanList.get(i));
						humanList.get(i).setPet(dog);
						validDono = true;
					}
				}
					
				if (validDono == false){
					System.out.println( " Introduza um nome valido para o dono.");
					System.out.println("Nomes validos: ");
					for (Human human: humanList){
						System.out.print(human.getNome() + ", ");	
					}
						System.out.println("");
				}
					
			}
		return dog;
	}
	
	public static void createDogs(){
		String reply;
			do {
			createDog();
			System.out.println("Deseja criar mais cåes (s/n)");
			reply = sc.nextLine();
			System.out.println(reply);
			
			} while(!(reply.equals("n")));
		
	}
	
//	public static void setPet(){
//		String nomeDono;
//		String nomePet;
//		boolean validDono = false; 
//		boolean validPet = false;
//		int indexDono;
//		int x = 0;
//		
//		while (validDono == false){
//			System.out.println("Qual e o nome do Dono?");
//			nomeDono = sc.nextLine();
//	
//			for (Human human : humanList){
//				
//				if (human.getNome().equals(nomeDono)){
//					validDono = true;
//					indexDono = x;}
//				x++;
//				}
//			if (validDono == false){
//				System.out.println("Introduza um nome de dono valido.");
//			}
//			
//		}
//		
//		System.out.println("Qual e o nome do animal de estimaçao?");
//		nomePet = sc.next();
//		
//		//Pet newPet 
//	}

}
