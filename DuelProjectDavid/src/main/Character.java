package main;

public class Character implements Dueler {
        private int hp;
        private boolean loaded = false;
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
			if(caller instanceof Dueler)
			{
				return 3;
			}
			 if(!loaded) {
				  loaded = true;
				 return 0;
			 }
			 if(Math.random() > 0.5 && loaded ) {
				 loaded = false;
				return 1;
			 }
			 else {
				 return 2;
			 }
			 
		
		}

		@Override
		public void hit(Object caller) {
		    if( caller instanceof Duel) {
		    	hp -= 10;
		    }
			
		}


}
