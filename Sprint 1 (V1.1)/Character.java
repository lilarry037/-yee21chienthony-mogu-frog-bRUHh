/**
* Names:  Shairahavan Selvachandran, Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/
import java.util.*;
public class Character {
   
   // attributes
   private String name;
   private int health;
   private int hunger;
   public int xp;
   private int x;
   private int y;
   
   // constants
   private static int MAX_HEALTH= 20;
   private static int MAX_HUNGER = 20;
   
   // Constructor
   public Character (String name, int xp, int x, int y){
      this.name = name;
      this.health = MAX_HEALTH;
      this.hunger = MAX_HUNGER;
      this.xp = 0;
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
   
   public int getHunger() {
      return this.hunger;
   }
   
   public int getXp() {
      return this.xp;
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
   
   public void setHunger(int newHunger) {
      this.hunger = newHunger;
   }
   
   public void setXp(int newXp) {
      this.xp = newXp;
   }
   
   public void setX(int newX) {
      this.x = newX;
   }
   
   public void setY(int newY) {
      this.y = newY;
   }
    
   //Methods
   
   // the character takes damage
   public void takeDamage(int amount){
      health -= amount;
      System.out.println("Owwwww. Health Bar: " + this.health);
      if(health <= 0){
         System.out.println("One too many punches.");
         System.exit(0);
      }
   }
   
   // the character heals (boosts health bar)
   public void heal(int amount){
      health += amount;
      if(health > MAX_HEALTH){
         health = MAX_HEALTH;
         System.out.println("Already at full health.");
      } else {
         System.out.println("Healing! Health Bar: " + this.health);
      }
   }
   
   // the character becomes hungry (hunger bar decreases)
   public void becomeHungry(int amount){
      hunger -= amount;
      if (hunger <= 0){
         hunger = 0;
         System.out.println("Food...Water...Atmosphere...blah");
         System.exit(0);
      } else {
         System.out.println("Losing energy. Hunger Bar: " + this.hunger);
      }
   }
   
   // eat a food (effects depend on attributes)
   public void eat(Food foodEaten){
      hunger += foodEaten.hungerBoost;
      if(hunger > MAX_HUNGER){
         health = MAX_HUNGER;
         System.out.println("Already full.");
      } else {
         System.out.println("Yum! This " + foodEaten.getName() + " tastes great! Hunger Bar: " + this.hunger);
      }
      
      hunger += foodEaten.healthBoost;
      if(hunger > MAX_HEALTH){
         health = MAX_HEALTH;
      } 
   }
   
   // character moves from old spot to current dimensions
   public void move(int newX, int newY) {
      this.setX(newX);
      this.setY(newY);
      this.hunger -= 1;
      System.out.println("The Character moved to the new coordinates " + newX + ", " + newY + "!");
   }
   
   // player attacks a non-playing character (mob)
   public void attack(Weapon weaponUsed, Mob npc) {
       
      double distance;
      
      distance = Math.sqrt(Math.pow((this.x-npc.x),2) + Math.pow((this.y-npc.y),2));
      
      if (distance <= weaponUsed.damageRadius){
         npc.health -= weaponUsed.damage;
         System.out.println("Clang. You have hit the " + npc.name + " for " + weaponUsed.damage + " using the " + weaponUsed.getName() + ".");
         if (npc.health <= 0) {
            //mob dies
            System.out.println("You have killed the " + npc.name + "!");
            this.xp += 10;
            System.out.println("You have gained 10 XP. You now have " + this.xp + " XP.");
         }
      } else {
         System.out.println("Out of range for " + weaponUsed.getName() + ".");
      }
   }

   // player mines block
   public Block mineBlock(int x, int y, int pickPower) {
      //Generating instances of the blocks
      Block[] newBlock;
      newBlock = Block.listOfBlocks();
      //random number to get a random block to break for show
      int randomNumber = (int)(Math.random() * ((6 - 0) + 1)) + 0;
      newBlock[randomNumber].breakBlock(x, y, pickPower, newBlock[randomNumber].getDurability()); 
      
      return newBlock[randomNumber];
   }
   
   // toString method
   public String toString(){
      String output = "";
      output += "\nName: ";
      output += name;
      output += "\nHealth: ";
      output += health;
      output += "\nHunger: ";
      output += hunger;
      output += "\nXP: ";
      output += xp;
      output += "\nCoordinates: (";
      output += x + ", " + y + ")";
      
      return output;
   }
}
