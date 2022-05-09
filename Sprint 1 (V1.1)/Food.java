/**
* Names:  Shairahavan Selvachandran
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

public class Food extends Item{

  
  /**how much does it affect the hunger bar */
  public int hungerBoost;
  
  /**how much does it affect the health bar */
  public int healthBoost;

  //Constructor

  /**
  * Food
  * Creates an edible item (food) in minecraft.
  * @param name: the name of the item
  * @param itemID: the ID of the item
  * @param maxStack: the maximum number in a stack for the item 
  * @param hungerBoost: the amount of energy the item gives when consumed
  */
  public Food (String name, int itemID, int maxStack, int hungerBoost, int healthBoost){
     super(name, itemID, maxStack);
     this.hungerBoost = hungerBoost;
     this.healthBoost = healthBoost;
  }

  /**
  * Gets the amount of boost on the hunger bar that consuming the item gives
  * @return the item's hunger bar boost
  */
  public int getHungerBoost() {
     return this.hungerBoost;
  }
  
  /**
  * Gets the amount of boost on the health bar that consuming the item gives
  * @return the item's health regen
  */
  public int getHealthBoost() {
     return this.healthBoost;
  }

  /**
  * changes the amount that consuming the item contributes to the player's hunger
  * @param newHungerBoost - new hunger bar boost possible for item
  */
  public void setHungerBoost(int newHungerBoost) {
     this.hungerBoost = newHungerBoost;
  }
  
  /**
  * changes the amount that consuming the item contributes to the player's health
  * @param newHungerBoost - new health bar boost possible for item
  */
  public void setHealthBoost(int newHealthBoost) {
     this.healthBoost = newHealthBoost;
  }

  public String toString(){
     String output = super.toString();
     output += "\nHunger Boost";
     output += this.hungerBoost;   
     output += "\nHealth Boost";
     output += this.healthBoost;
     
     return output;
  }
}
