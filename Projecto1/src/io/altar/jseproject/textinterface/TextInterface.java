package io.altar.jseproject.textinterface;

import java.util.Scanner; //https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html


public class TextInterface {
		static Scanner scanner = new Scanner(System.in);
		
		
		////    main        //////
	public static void main(String[] args) {
		firstPage();
	 
	
	}
	
	//////    first page    /////////
	public static void firstPage(){
		
		boolean valid = false;
		while (!valid){
		
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1)	Listar produtos");
		System.out.println("2)	Listar prateleiras");
		System.out.println("3)	Sair");
		
			String choice = scanner.nextLine();
			
		try {	
				int op = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			continue;
		}
		
		if (choice == 1){
			System.out.print("ok");
		}
		
	  
//	     switch(choice){
//     	case("1"):
//     	case("2"):	
//     	case("3"):
//    		valid = true;
//     		break;
//    	default:
//   		System.out.println("Introduza uma opcao valida");
//    		break;	
//	     		
     //} 
	    
		}	     
 //scanner.close();



		
		
		
	}

}