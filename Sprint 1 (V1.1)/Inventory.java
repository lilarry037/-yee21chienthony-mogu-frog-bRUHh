/**
* Names:  Larry Li
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: create the inventory class of the player character
*/

public class Inventory {

  private int maxItems;
  private int inventorySelection;
  

  public Inventory(int maxItems){
    this.maxItems = maxItems;
    this.inventorySelection = 0;
  }

  public int getMaxItems() {
	  return maxItems;
  }
  
  public int getInventorySelection() {
	  return inventorySelection;
  }
  
  //no setter as maxItems is final upon creation of the inventory
  
  int[] inventoryNum = new int[maxItems];
  Item[] inventory = new Item[maxItems];

  public void addItem(Item thing, int amount) {
	  inventory[thing.getItemID()] = thing;
	  if((thing.getItemID() + amount) < thing.getMaxStack()) {
		  inventoryNum[thing.getItemID()] += amount;
	  }else {
		 inventoryNum[thing.getItemID()] = thing.getMaxStack();
		 System.out.println("Cannot pick up any more");
	  }
  }

  public void changeSelection(int num) {
	  if(inventorySelection < num) {
		  inventorySelection = num;
	  }
  }
  public Item getItem() {
	  return inventory[inventorySelection];
  }
  
}
