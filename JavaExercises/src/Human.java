
public class Human extends Animals {
	private String nome;
	private char sexo;
	private Pet pet; 
	

	
		public Human(int ID, String nome, int idade, char sexo) {
		super(ID, "Humano", idade);
		this.setID(ID);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
	}

		@Override
	public int getID() {
		// TODO Auto-generated method stub
		return super.getID();
	}

	@Override
	public void setID(int ID) {
		// TODO Auto-generated method stub
		this.ID = ID;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
		pet.setOwner(this);
	}
	
	@Override
	public String toString(){
		return (" / ID: " + this.getNome());
		//inserir outros campos
	}

	
	
	@Override
	public void showStatus(){
		System.out.print(" / ID: " + this.getID());
		System.out.print(" / Nome: " + this.getNome());
		System.out.print(" / Idade: " + this.getIdade());
		System.out.print(" / Sexo: " + this.getSexo());
		System.out.println(" / Tipo : Animal " + this.getTipo());
		try {
			System.out.println("/ Animal de Estimaçao : " + this.getPet().getNome());
		} catch (Exception e) {
			System.out.println("/ Nao tem animal de estimaçao.");
		}
		System.out.println("__________________________");
		System.out.println("");
	}
	
	@Override
	public void vocalizaçao(){
		System.out.println("Ser ou nao ser eis a Questao!..");
	}
}
