package main;



public class duel {

	

	private Dueler d1;
	private Dueler d2;
	
	
	
	
	public static void main(String[] args){
		Duel duel = new Duel();
		duel.dukeItOut();
	}
	
	public duel() {
		d1 = new CharacterA();
		d2 = new CharacterB();
	}
	
	public void dukeItOut(){
		
	}
	

}
