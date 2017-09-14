package main;

public class Character implements Dueler {
        private int hp;
	    public Character(){}
	    
		@Override
		public void setStartingHP(int hp) {
			this.hp = hp;
			
		}
		@Override
		public int getHP() {
			// TODO Auto-generated method stub
			return hp;
		}
		@Override
		public void taunt() {
			System.out.println("GET READY TO LOSE");
			
		}
		@Override
		public String getName() {
			return "David Li";
		}
		@Override
		public boolean determineIfOpponentIsFair(Dueler d, int hp) {
			
			
		}

}
