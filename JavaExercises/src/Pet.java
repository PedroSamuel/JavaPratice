
//import java.util.HashMap;

public abstract class Pet extends Animals{
	private Human owner;
	private String nome;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Pet(String nome, int ID, String tipo, int idade) {
		super(ID, tipo, idade);
		// TODO Auto-generated constructor stub
	}

	public Human getOwner() {
		return owner;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}
	
	

}
