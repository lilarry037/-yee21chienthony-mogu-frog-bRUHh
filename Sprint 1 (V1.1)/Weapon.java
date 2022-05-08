
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
   * toString
   * Returns a string with the attributes of the item.
   * @return returnString: 
   */
   public String toString() {
      String returnString = "\nDamage: " + this.damage + "\nDamage Radius: " + this.damageRadius + "\nDurability: " + this.durabilitys;
      
      return returnString;
   }
}