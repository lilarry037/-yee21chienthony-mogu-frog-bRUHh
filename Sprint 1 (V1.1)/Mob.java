/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: a simplistic mob
*/
public class Mob {
   public String name;
   public int health;
   public int damage;
   public int x;
   public int y;
   
   private final int MAX_HEALTH = 20;

   public Mob (String name, int damage, int x, int y){
      this.name = name;
      this.health = MAX_HEALTH;
      this.damage = damage;
      this.x = x;
      this.y = y;
   }

   /*
    Methods
   */
   
   //Accessors
   
   public String getName() {
      return this.name;
   }
   
   public int getHealth() {
      return this.health;
   }
   
   public int getDamage() {
      return this.damage;
   }
   
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   //Mutators
    
   public void setName(String newName) {
      this.name = newName;
   }
   
   public void setHealth(int newHealth) {
      this.health = newHealth;
   }
   
   public void setDamage(int newDamage) {
      this.damage = newDamage;
   }
   
   public void setX(int newX) {
      this.x = newX;
   }
   
   public void setY(int newY) {
      this.y = newY;
   }
    
   //Methods

   public void takeDamage(int amount){
      health -= amount;
      if(health <= 0){
         //object is destroyed
      }
   }
   
   public void attack(Character player) {
      
   }
   
   public void move() {
      
   }
}
