
public abstract class Animals {
		protected int ID;
		private String tipo;
		private int idade;
	
	
	
		public Animals(int ID, String tipo, int idade) {
		this.setID(ID);
		this.setTipo(tipo);
		this.setIdade(idade);
		}
		
		
		public int getID() {
		return ID;
	}
		
		
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void showStatus();
	public abstract void vocalizaçao();
	

}
