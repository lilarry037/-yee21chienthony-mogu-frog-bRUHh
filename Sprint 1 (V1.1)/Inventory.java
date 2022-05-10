/**
* Names:  Larry Li
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: create the inventory class of the player character
*/

public class Inventory {

  private int maxItems;
  private int inventorySelection;
  

  public Inventory(){
	  this.maxItems = 64;
	   this.inventorySelection = 0;
	}
  
  public Inventory(int maxItems, int inventorySelection){
    this.maxItems = maxItems;
    this.inventorySelection = inventorySelection;
  }

  public int getMaxItems() {
	  return maxItems;
  }
  
  public int getInventorySelection() {
	  return inventorySelection;
  }
  
  //no setter as maxItems is final upon creation of the inventory
  
  int[] inventoryNum = new int[64];
  Item[] inventory = new Item[64];

  public void addItem(Item thing, int amount, int invPosition) {
	  if(inventory[invPosition] != null) {
		  if(inventory[invPosition] != thing) {
			  System.out.println("Cannot stack the items.");
		  }
	  }else {
		  inventory[invPosition] = thing;
	  }
	  
	  if((inventoryNum[invPosition] + amount) <= thing.getMaxStack()) {
		  inventoryNum[invPosition] += amount;
	  }else {
		 inventoryNum[invPosition] = thing.getMaxStack();
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
  
  public int getAmount() {
	  return inventoryNum[inventorySelection];
  }
  
  public String toString() {
	  String returnString = "";
	  for(int i = 0; i < 64; i++) {
		  if (inventoryNum[i] > 0) {
			  returnString += inventory[i].getName() + ": " + inventoryNum[i];
			  returnString += "\n";
		  }
	  }
	  return returnString;
  }
  
}
