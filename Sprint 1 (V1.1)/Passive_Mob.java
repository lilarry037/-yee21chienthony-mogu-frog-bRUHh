/**
* Names:  Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

public class Passive_Mob extends Mob {
  
   public boolean hasBred;
  
    public Passive_Mob (String name, int x, int y, boolean hasBred){
      super(name, x, y);
      this.hasBred = hasBred;
   }
}
