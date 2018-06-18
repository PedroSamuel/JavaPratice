package io.altar.jseproject.textinterface;

public class ErrorState implements State{

	@Override
	public boolean runState() {
		System.out.println("XX Opção não válida. XX");
		return false;

	}

}
