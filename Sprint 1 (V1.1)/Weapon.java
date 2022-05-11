/**
 * Names: Shairahavan Selvachandran
 * Class: ICS4U1-5A
 * Date: April 29th, 2022
 * Description: Basic Character to be controlled.
 */

public class Weapon extends Item {

    /*
       Attributes
    */

    /** the amount of damage the item does (if it is a weapon) */
    public int damage;

    /** the range of the weapon */
    public double damageRadius;

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
    public Weapon(String name, int itemID, int maxStack, int damage, double damageRadius, double durability) {
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
    public int getDamage() {
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
    public void setDamage(int newDamage) {
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
    public void setDurability(double newDurability) {
        this.durability = newDurability;
    }

    // Methods

    /**
     * toString
     * Returns a string with the attributes of the item.
     * @return returnString: 
     */
    public String toString() {
        String output = super.toString();
        output += "\nDamage: " + this.damage + "\nDamage Radius: " + this.damageRadius + "\nDurability: " + this.durability;

        return output;
    }
}
