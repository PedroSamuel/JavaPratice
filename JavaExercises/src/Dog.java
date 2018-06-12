
public class Dog extends Pet{
	private String nome;
	private String Raça;
	private char Sexo;
	
	public Dog(int ID, String nome, int idade, char  sexo, String raça) {
		super(nome, ID, "Domestico", idade);
		// TODO Auto-generated constructor stub
		this.setID(ID);
		this.setRaça(raça);
		this.setNome(nome);
		this.setSexo(sexo);
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return super.getID();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaça() {
		return Raça;
	}
	
	public void setRaça(String raça) {
		Raça = raça;
	}
	
	@Override
	public void setID(int ID) {
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
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	
	@Override
	public void vocalizaçao(){
		System.out.println("Auuuuf, auuuuf!");
	}
	
	@Override
	public void showStatus(){
		System.out.print(" / ID: " + this.getID());
		System.out.print(" / Nome: " + this.getNome());
		System.out.print(" / Idade: " + this.getIdade());
		System.out.print(" / Sexo: " + this.getSexo());
		System.out.println(" / Tipo : Animal " + this.getTipo());
		try {
			System.out.println("/ Owner : " + this.getOwner().getNome());
		} catch (Exception e){
			System.out.println("/ Nao tem dono.");
		};
		System.out.println("__________________________");
		System.out.println("");
	}
	
	
	
	
	
}
