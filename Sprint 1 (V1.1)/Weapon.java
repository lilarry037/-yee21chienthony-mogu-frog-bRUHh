
public class Weapon extends Item {

   private final int MAX_ACCURACY = 100;
   private final int MIN_DURABILITY = 0;
   private final int FARMING_DISTANCE = 5;
   
   /*
      Attributes
   */
   
   /** the amount of damage the item does (if it is a weapon) */
   private double damage;
   
   /** the range of the weapon */
   private double damageRadius;

   /** the durability of the weapon */
   private double durability;
   
   /*
      Constructor
   */
   
   /**
   * Weapon
   * Creates a weapon in Minecraft.
   * @param name: the name of the weapon
   * @param itemID: the ID of the weapon
   * @param maxStack: the maximum number in a stack for the weapon 
   * @param damage: the amount of damage the weapon does
   * @param damageAccuracy: the accuracy of damage of the weapon
   * @param durability: the durability of the weapon
   */
   public Weapon (String name, int itemID, int maxStack, double damage, double damageRadius, double durability) {
      super(name, itemID, maxStack);
      this.damage = damage;
      this.damageRadius = damageRadius;
      this.durability = durability;
   }
   
   /*
      Accessors
   */
   
   /**
   * Gets the damage of the weapon
   * @return the weapon's damage
   */
   public double getDamage() {
      return this.damage;
   }
   
   /**
   * Gets the range of damage for the weapon
   * @return the weapon's range
   */
   public double getDamageRadius() {
      return this.damageRadius;
   }
   
   /**
   * Gets the durability of the weapon
   * @return the weapon's durability
   */
   public double getDurability() {
      return this.durability;
   }

   /*
      Mutators
   */
   
   /**
   * changes the amount of damage the weapon does
   * @param newDamage - new amount of damage for the weapon
   */
   public void setDamage(double newDamage) {
      this.damage = newDamage;
   }
   
   /**
   * changes the range of damage for the weapon
   * @param newDamageRadius - new range of damage
   */
   public void setDamageRadius(double newDamageRadius) {
      this.damageRadius = newDamageRadius;
   }

   /**
   * changes the durability of the weapon
   * @param newDurability - the new durability of the weapon
   */
   public void setDurability(double newDurability){
      this.durability = newDurability;
   }
  
   // Methods

   /**
   * useWeapon
   * The weapon is used on an object if it is within range.
   * @param itemAttacked - the item that is to be attacked
   
   public void attack(Character player, Mob npc) {
      double distance;
      
      distance = Math.sqrt(Math.pow((player.x-npc.x),2) + Math.pow((player.y-npc.y),2));
      
      if (distance <= this.damageRadius){
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
  
   /**
   * toString
   * Returns a string with the attributes of the item.
   * @return returnString: 
   */
   public String toString() {
      String returnString = "\nDamage: " + this.damage + "\nDamage Accuracy: " + this.damageAccuracy;
      
      return returnString;
   }
}