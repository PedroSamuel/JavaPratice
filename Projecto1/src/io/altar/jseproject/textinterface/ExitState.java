package io.altar.jseproject.textinterface;

public class ExitState implements State {

	@Override
	public boolean runState() {
		System.out.println("Obrigado pela visita.");
		System.out.println("#####################");
		
		System.exit(0);
		return false;
		
	}

}
