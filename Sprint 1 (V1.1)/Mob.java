/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Creates armor in Minecraft.
*/
public class Mob {
   private String name;
   private int health;
   private int damage;
   private boolean dead = false;
   private int x;
   private int y;
   private int z;
   
   private final int MAX_HEALTH = 20;

   public Mob (String name, int damage, int x, int y){
      this.name = name;
      this.health = MAX_HEALTH;
      this.damage = damage;
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
   
   public int getDamage() {
      return this.damage;
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
   
   public void setDamage(int newDamage) {
      this.damage = newDamage;
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
   
   public void attack(Character player) {
      
   }
   
   public void move() {
      
   }
}
