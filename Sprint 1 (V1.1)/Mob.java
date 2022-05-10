/**
* Names:  Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: a simplistic mob
*/

public class Mob {
          
   // Attributes
   public String name;
   public int health;
   public int damage;
   public boolean dead = false;
   public int x;
   public int y;
   
   //Constants
   private final int MAX_HEALTH = 20;
          
   //Constructor
   public Mob (String name, int damage, int x, int y){
      this.name = name;
      this.health = MAX_HEALTH;
      this.damage = damage;
      this.x = x;
      this.y = y;
      this.dead = dead;
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
   
   public boolean getDead() {
      return this.dead;
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
   
   public void setDead(boolean newDead) {
      this.dead = newDead;
   }
    
   //Methods (attack method to be made by Cyrus in Hostile_Mob.java)
   
   // Mob moves
   public void move(int newX, int newY) {
      this.setX(newX);
      this.setY(newY);
      System.out.println("The Character moved to the new coordinates " + newX + ", " + newY + "!");
   }
}
