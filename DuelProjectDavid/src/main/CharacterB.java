package main;

public class CharacterB implements Dueler {
        private int hp;
	    public CharacterB(){}
	    
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
			System.out.println("HAVE FUN BRO!");
			
		}
		@Override
		public String getName() {
			return "Eric Li";
		}
		@Override
		public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		   if(d.getHP() ==hp)
		   {
			   return true;
		   
		   }
		   else
		   {
			   return false;
		   }
			
		}

		@Override
		public int getAction(Object caller) {
			 return (int) (Math.random() *3 +0);
		}

		@Override
		public void hit(Object caller) {
		    if( caller instanceof Duel) {
		    	hp -= 10;
		    }
			
		}


}
