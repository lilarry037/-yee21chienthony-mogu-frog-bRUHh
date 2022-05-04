
public class Food extends Item{

  
  /**how much does it affect the hunger bar */
   private int hungerBoost;

  //Constructor

  /**
   * Food
   * Creates an edible item (food) in minecraft.
   * @param name: the name of the item
   * @param itemID: the ID of the item
   * @param maxStack: the maximum number in a stack for the item 
   * @param hungerBoost: the amount of energy the item gives when consumed
   */
   public Food (String name, int itemID, int maxStack, int hungerBoost){
      super(name, itemID, maxStack);
      this.hungerBoost = hungerBoost;
   }

   /**
   * Gets the amount of boost on the hunger bar that consuming the item gives
   * @return the item's hunger bar boost
   */
   public double getHungerBoost() {
      return this.hungerBoost;
   }

   /**
   * changes the amount that consuming the item contributes to the player
   * @param newHungerBoost - new hunger bar boost possible for item
   */
   public void setHungerBoost(double newHungerBoost) {
      this.hungerBoost = newHungerBoost;
   }
  
   public void eat(Character player, Food food){
      player.hunger += food.hungerboost;
   }

   public void toString(){
      String output = "";
      output += "Name: ";
      output += name;
      output += "\nID: ";
      output += itemID;
      output += "\nHunger Boost";
      output += hungerBoost;
    
   }
  
}