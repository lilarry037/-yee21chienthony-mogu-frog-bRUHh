/**
* Names:  Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

public class Armor extends Item {
   /** the max durability of the armor*/
   private final int MAX_DURABILITY = 100;

   /** the min durability of the armor*/
   private final int MIN_DURABILITY = 0;

   /** the material of the armor*/
   private String material;

   /** the armor value of the armor*/
   private int armorValue;
   
   private int durability;

   

  /**
   Armor
   Creates a piece of armor
   @param name - the name of the armor
   @param material - the material of the armor
   @param itemID - the itemID of the armor
   @param colour - the colour of human
   @param durability - the durability of human
   @param armorValue - the armorValue of human
   */
   public Armor (String name, int itemID, int maxStack, int durability, String material, int armorValue) {
      super(name, itemID, maxStack);
      this.durability = durability;
      this.material = material;
      this.armorValue = armorValue;
   }
   
   // Getters
  
   /**
   * Gets the name of the armor
   * @return the armor's name
   */
   public String getMaterial() {
      return this.material;
   } 

   /**
   * Gets the ID of the armor
   * @return the armor's ID
   */ 
   public int getArmorValue() {
      return this.armorValue;
   }

   // Setters

   /**
   * Sets the material of the armor
   * @param newMaterial - new material of armor
   */
   public void setMaterial(String newMaterial) {
      this.material = newMaterial;
   } 

   /**
   * Sets the armor value of the armor
   * @param newArmorValue - new armor value of armor
   */
   public void setArmorValue(int newArmorValue){
      this.armorValue = newArmorValue;
   }
   
   // Methods
  
    /**
    * Fixes armor with number of materials given
    * @param numberOfMaterials - number of materials provided to repair armor, 10 will fix a piece of armor to full durability
    */
    public double fixArmor(int numberOfMaterials) {
      if ((durability += numberOfMaterials * 10) >   MAX_DURABILITY) {
        this.durability =  MAX_DURABILITY;
      }
      return durability;
    }
   
   // Returns a string with all the attributes of the armor
   public String toString() {
      String returnString = "Name: " + getName() + "\nMaterial:  " + this.material + "\nItem number: #" + getItemID() + "\nDurability: " + this.durability + "\nArmor Value: " + this.armorValue;
      
      return returnString;
   }
}
