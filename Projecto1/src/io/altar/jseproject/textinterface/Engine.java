package io.altar.jseproject.textinterface;

public class Engine {
	private int	currentState = 0;
	
	
	
	private State[] StatesList = {				// Index
		new ErrorState(),						//0
		new ExitState(),						//1
		new InitialMenuState(),					//2
		new ListItemState("Produto"),			//3	
		new ListItemState("Prateleira"),		//4
		new CreateProductState(),				//5
		new EditProductState(),					//6
		new ConsultProductState(),				//7
		new DeleteProductState(),				//8
		new CreateShelfState(),					//9
		new EditShelfState(),					//10	
		new ConsultShelfState(),				//11
		new DeleteShelfState()					//12
		
		};
	
		/*
		 * Define as opções a seguir a partir dos diferentes estados.
		 */
	private int[][] transitionMatrix = {	 
			{2},						//0 ErrorState		
			{},							//1 Exit
			{0,3,4,1,0,0},				//2 InitialMenu
			{0,5,6,7,8,2},				//3 ListProducts
			{0,9,10,11,12,2},			//4 ListShelfs
			{3},						//5 Create Product
			{3},						//6 Edit Product
			{3},						//7 Consult Product
			{3},						//8 Delete Product
			{4},						//9 Create Shelf
			{4},						//10 Edit Shelf							
			{4},						//11 ConsultShelf
			{4}						//12 DeleteShelf
	};
			
		
	public boolean nextStep(int transition) {
		if(currentState!=0){
			transitionMatrix[0][0] = currentState; 
		}
		currentState = transitionMatrix[currentState][transition];
		return StatesList[currentState].runState();
	}
	
	public int[] checkOptions() {
		int size = (transitionMatrix[currentState].length);
		int options[] = new int[size];
		for (int i=0; i < size; i++){
			options[i] = i;
		}
		
		return options;
	}
	
	public void launchEngine() {
		System.out.println("__________________________________");
		System.out.println("********** BEM VINDO *************");
		System.out.println("##################################");
		System.out.println("___ Sistema de gestão de Stocks___");
		System.out.println("");
		
		int transition = 0;
		while (true) {
				
				if (this.nextStep(transition)) {
			transition = Reader.readfromChoices(checkOptions(), 0);
			System.out.println("");
			} else {
				transition = 0;
			}
				
		}
	}
	
	//******************* MAIN ***********************
	public static void main(String[] args) {
		Engine sme = new Engine();
		sme.launchEngine();	
	}
}
	
