package io.altar.jseproject.textinterface;

public class InitialMenuState implements State {
	

	@Override
	public boolean runState() {
	System.out.println("Por favor selecione uma das seguintes opções:");
	System.out.println("1)	Listar produtos");
	System.out.println("2)	Listar prateleiras");
	System.out.println("3)	Sair");
	return true;
	}
	

}
