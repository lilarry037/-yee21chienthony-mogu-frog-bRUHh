/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled (very bare bones).
*/

public class Character {
   
   private String name;
   private int health;
   private int hunger;
   private int xp;
   private int x;
   private int y;
   private int z;
   
   private final int MAX_HEALTH = 20;
   private int MAX_HUNGER = 20;

   public Character (String name, int x, int y){
      this.name = name;
      this.health = MAX_HEALTH;
      this.hunger = MAX_HUNGER;
      this.xp = 0;
      this.x = x;
      this.y = y;
      this.z = 0;
   }

   /*
    Methods
   */
   
   //Accessors
   
   public int getName() {
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
   
   public int getZ() {
      return this.Z;
   }
   
   //Mutators
    
   public void setName(int newName) {
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
   
   public void setZ(int newZ) {
      this.z = newZ;
   }
    
   //Methods

   public void takeDamage(int amount){
      health -= amount;
      if(health <= 0){
         //dead();
      }
   }

   public void heal(int amount){
      health =+ amount;
      if(health > MAX_HEALTH){
         health = MAX_HEALTH;
      }
   }

   public void becomeHungry(int amount){
      hunger -= amount;
      if (hunger <= 0){
         hunger = 0;
         hungerbarempty = true;
         //takeDamage(4); or //dead
      } else if (hunger > 0){
         hungerbarempty = false;
      }
   }

   public void eat(Food foodEaten){
      hunger =+ foodEaten.hungerBoost;
      if(hunger > MAX_HUNGER){
         health = MAX_HUNGER;
      }
      
      hunger =+ foodEaten.healthBoost;
      if(hunger > MAX_HEALTH){
         health = MAX_HEALTH;
      }
   }
   
   public void move() {
      //Change x,y,z coordinates
   }
   
   /**
    * attack
    * The weapon is used on an object if it is within range.
    * @param itemAttacked - the item that is to be attacked
    */
   public void attack(Weapon weaponUsed, Mob npc) {
       
      double distance;
       
      distance = Math.sqrt(Math.pow((player.x-npc.x),2) + Math.pow((this.y-npc.y),2));
       
      if (distance <= weaponUsed.damageRadius){
         npc.hitpoints -= weaponUsed.damage;
         if (npc.hitpoints <= 0) {
            //mob dies
            System.out.println("You have killed" + npc.name + "!");
         }
      } else {
         System.out.println("Out of range.");
      }
   }
    
   /**
   * farm
   * The weapon is used on an object if it is within range.
   * @param itemAttacked - the item that is to be attacked
   */
   public void farm(Weapon tool, Item block) {
       
      double distance;
       
      distance = Math.sqrt(Math.pow((player.x-block.x),2) + Math.pow((player.y-block.y),2));
       
      if (tool.farmingTool == true){
         if (distance <= tool.farmingTool) {
            resource.durability -= tool.damage;
            // if weapon breaks
            // increase inventory
            // check if it exceeds maxStack (return to maxStack if so)
         } else {
            System.out.println("Out of range.");
         }
      } else {
         System.out.println("Inadequate farming tool.");
      }  
   }
    
   public void dead() {
      //Link to death messages
      // End game?
   }

   public String toString(){
      String output = "";
      output += "Name: ";
      output += name;
      output += "Health: ";
      output += health;
      output += "\nHunger: ";
      output += hunger;
      output += "\nXP: ";
      output += xp;
      output += "Coordinates: (";
      output += x + ", " + y + ", " + z + ")";
   }
}