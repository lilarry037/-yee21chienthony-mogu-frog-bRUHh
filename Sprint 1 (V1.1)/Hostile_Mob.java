/**
* Names:  Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

public class Hostile_Mob extends Mob {
  
   public Item inHand;
   public int damage;
  
    public Hostile_Mob (String name, int damage, int x, int y, Item inHand){
      super(name, x, y);
      this.damage = damage;
      this.inHand = inHand;
   }
  
    public void setDamage(int newDamage) {
      this.damage = newDamage;
   }
  
   public void attack(Character player) {
      
   }
}
