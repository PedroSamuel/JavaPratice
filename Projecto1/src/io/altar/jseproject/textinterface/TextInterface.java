package io.altar.jseproject.textinterface;
import java.util.Scanner; //https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html



public class TextInterface {
		static Scanner scanner = new Scanner(System.in);
		
		
	//******************* MAIN ***********************
	public static void main(String[] args) {
		firstMenu();
	}
	
	
	//**************************    first menu  ****************************
	public static void firstMenu(){
		
		boolean valid = false;
		while (!valid){
		
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1)	Listar produtos");
			System.out.println("2)	Listar prateleiras");
			System.out.println("3)	Sair");
			
			String choice = scanner.nextLine();
			int op = Utilities.toInt(choice, 6);
			
			
			switch(op){
				case 1: 
					listProducts();
					valid = true;
					break;
				case 2:
					listShelfs();
					valid = true;
					break;
				case 3:
					System.out.println("Obrigado pela visita.");
					System.out.println("#####################");
					valid = true;
					break;
				default:
					System.out.println("Por favor introduza uma opçåo valida.");
					break;
			}
		}
	}
		
			

	//**********************************  LISTAR PRODUTOS **************************
	public static void listProducts(){
		
		boolean valid = false;
		
		while (!valid){
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1)	Criar novo produto");
			System.out.println("2)	Editar um produto existente");
			System.out.println("3)	Consultar os detalhes de um produto");
			System.out.println("4)	Remover um produto");
			System.out.println("5)	Voltar ao menu anterior");
			String choice = scanner.nextLine();
			int op = Utilities.toInt(choice, 6);
			
			switch(op){
			
				case 1: 
					productInterface.newProduct();				
					break;
				case 2: 
					System.out.println("Editar Produto:");
				case 3:
					System.out.println("Consultar Produto:");
				case 4:
					System.out.println("Remover Produto:");
				case 5:
					firstMenu();
					valid = true;
				default:
					System.out.println("Por favor introduza uma opçåo valida.");
			}
		}
	}
	
	//**************************  LISTAR PRATELEIRAS    *********************************
	public static void listShelfs(){

		boolean valid = false;
		
		while (!valid){
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1)	Criar nova prateleira");
			System.out.println("2)	Editar uma prateleira existente");
			System.out.println("3)	Consultar os detalhes de uma prateleira");
			System.out.println("4)	Remover uma prateleira");
			System.out.println("5)	Voltar ao menu anterior");
			String choice = scanner.nextLine();
			int op = Utilities.toInt(choice, 6);
		
			switch(op){
				case 1:
					System.out.println("Nova Prateleira:");
					break;
				case 2:
					System.out.println("Editar Prateleira:");
					break;
				case 3: 
					System.out.println("Consultar Prateleira:");
					break;
				case 4:
					System.out.println("Remover Prateleira:");
					break;
				case 5:
					firstMenu();
					valid = true;
					break;
				default:
					System.out.println("Por favor introduza uma opçåo valida.");
					break;
			}
		}

	}
}
