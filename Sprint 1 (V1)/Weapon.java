
public class Weapon extends Item {

   private final int MAX_ACCURACY = 100;
   private final int MIN_DURABILITY = 0;
   
   /*
      Attributes
   */
   
   /** the amount of damage the item does (if it is a weapon) */
   private double damage;
   
   /** the accuracy of the weapon */
   private double damageAccuracy;

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
   public Weapon (String name, int itemID, int maxStack, double damage, double damageAccuracy, double durability) {
     super(String name, int itemID, int maxStack)
    this.damage = damage;
    this.damageAccuracy = damageAccuracy;
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
   * Gets the accuracy of damage of the weapon
   * @return the weapon's accuracy
   */
   public double getDamageAccuracy() {
      return this.damageAccuracy;
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
   * changes the accuracy of damage for the item
   * @param newDamageAccuracy - new damage accuracy of item
   */
   public void setDamageAccuracy(double newDamageAccuracy) {
      this.damageAccuracy = newDamageAccuracy;
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
      String returnString = "\nDamage: " + this.damage + "\nDamage Accuracy: " + this.damageAccuracy;
      
      return returnString;
   }
}