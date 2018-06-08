package io.altar.jseproject.textinterface;

import java.util.Scanner; //https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html


public class TextInterface {
		static Scanner scanner = new Scanner(System.in);
		
		
		////    main        //////
	public static void main(String[] args) {
		firstMenu();
	 
	
	}
	
	/////////////////////////////////////    first menu    //////////////////////////////
	public static void firstMenu(){
		
		boolean valid = false;
		while (!valid){
		
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1)	Listar produtos");
			System.out.println("2)	Listar prateleiras");
			System.out.println("3)	Sair");
			
			int choice = scanner.nextInt();
			
			//voltar a experimentar com switch.
			
			//switch(choice)
			
			
			
			if (choice == 1){
				listProducts();
				valid = true;
			} else if (choice == 2){
				listShelfs();
			} else if (choice == 3);
				System.out.println("Obrigado pela visita.");
				System.out.println("#####################");
				valid = true;
				

				
		}	     



	}
		//tentar voltar 
	/////////////////////////////////////  Listar Produtos    ////////////////////////////
	public static void listProducts(){
		
		boolean valid = false;
		
		while (!valid){
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1)	Criar novo produto");
			System.out.println("2)	Editar um produto existente");
			System.out.println("3)	Consultar os detalhes de um produto");
			System.out.println("4)	Remover um produto");
			System.out.println("5)	Voltar ao menu anterior");
			int choice = scanner.nextInt();
			if (choice == 1){
				listProducts();
				valid = true;
			} else if (choice == 2){
				listShelfs();
			} else if (choice == 3);
				firstMenu();
				valid = true;
		}	
		     
	}
	
	/////////////////////////////////////  Listar Prateleiras    ////////////////////////////
	public static void listShelfs(){

		boolean valid = false;
		
		while (!valid){
			System.out.println("Por favor selecione uma das seguintes opções:");
			System.out.println("1)	Criar nova prateleira");
			System.out.println("2)	Editar uma prateleira existente");
			System.out.println("3)	Consultar os detalhes de uma prateleira");
			System.out.println("4)	Remover uma prateleira");
			System.out.println("5)	Voltar ao menu anterior");
			int choice = scanner.nextInt();
			
			if (choice == 1){
				listProducts();
				valid = true;
			} else if (choice == 2){
				listShelfs();
			} else if (choice == 3);
				firstMenu();
				valid = true;
		}	

	}
	
	
	
	
	
		//scanner.close(); 
}
