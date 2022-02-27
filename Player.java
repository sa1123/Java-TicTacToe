package tictactoe;

public class Player {
	
	private String name;
	private char symbol;
	
	public Player(String name, char symbol) {
		setName(name);
		setSymbol(symbol);
	}	

	public void setName(String name) {
		// TODO Auto-generated method stub
		if(!name.isEmpty()) {
			this.name = name;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSymbol(char symbol) {
		// TODO Auto-generated method stub
		if(symbol != '\0') {
			this.symbol = symbol;
		}
		
	}
	
	public char getSymbol() {
		return this.symbol = symbol;
	}

}
