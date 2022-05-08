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
   private boolean dead = false;
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
      this.dead = dead;
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
   
   public boolean getDead() {
      return this.dead;
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
   
   public void setDead(boolean newDead) {
      this.dead = newDead;
   }
    
   //Methods

   public void takeDamage(int amount){
      health -= amount;
      if(health <= 0){
         dead = true;
      }
   }

   public void heal(int amount){
      health =+ amount;
      if(health > MAX_HEALTH){
         health = MAX_HEALTH;
      }
   }

   public void getHungry(int amount){
      hunger -= amount;
      if (hunger < 0){
         hunger = 0;
         hungerbarempty = true;
      }
      if(hunger <= 0){
         takeDamage(4);
      }
      else if (hunger > 0){
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
      
   }
   
   /**
    * useWeapon
    * The weapon is used on an object if it is within range.
    * @param itemAttacked - the item that is to be attacked
    
    public void attack(Weapon weaponUsed, Mob npc) {
       double distance;
       
       distance = Math.sqrt(Math.pow((player.x-npc.x),2) + Math.pow((this.y-npc.y),2));
       
       if (distance <= weaponUsed.damageRadius){
          npc.hitpoints -= this.damage;
       } else {
          System.out.println("Out of range.");
       }
    }
    
    /**
    * useWeapon
    * The weapon is used on an object if it is within range.
    * @param itemAttacked - the item that is to be attacked
    
    public void farm(Character player, Item resource) {
       double distance;
       
       distance = Math.sqrt(Math.pow((player.x-resource.x),2) + Math.pow((player.y-resource.y),2));
       
       if (FARMING_DISTANCE >= this.damageRadius){
          if (distance <= FARMING_DISTANCE) {
             resource.hitpoints -= this.damage;
             // somethign to increase inventory of item
          } else {
             System.out.println("Out of range.");
          }
       } else {
          System.out.println("Inadequate farming tool.");
       }
    }
    */

   public String toString(){
      String output = "";
      output += "Health: ";
      output += health;
      output += "\nHunger: ";
      output += hunger;
      output += "\nXP: ";
      output += xp;
   }
   
}