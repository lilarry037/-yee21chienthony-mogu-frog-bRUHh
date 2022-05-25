/**
 * Names:  Larry Li
 * Class: ICS4U1-5A
 * Date: April 29th, 2022
 * Description: create the inventory class of the player character
 */

public class Inventory {

    private int maxItems;
    private int inventorySelection;


    public Inventory(int maxItems, int inventorySelection) {
        this.maxItems = maxItems;
        this.inventorySelection = inventorySelection;
        int[] inventoryNum = new int[maxItems];
        Item[] inventory = new Item[maxItems];
    }

    public int getMaxItems() {
        return maxItems;
    }

    public int getInventorySelection() {
        return inventorySelection;
    }

    //no setter as maxItems is final upon creation of the inventory
    

    public void addItem(Item thing, int amount, int invPosition) {
        if (inventory[invPosition] != null) {
            if (inventory[invPosition] != thing) {
                System.out.println("Cannot stack the items.");
            }
        } else {
            inventory[invPosition] = thing;
        }

        if ((inventoryNum[invPosition] + amount) <= thing.getMaxStack()) {
            inventoryNum[invPosition] += amount;
        } else {
            inventoryNum[invPosition] = thing.getMaxStack();
            System.out.println("Cannot pick up any more");
        }
    }

    public void changeSelection(int num) {
        if (inventorySelection < num) {
            inventorySelection = num;
        }
    }
    
    public Item getItem() {
        return inventory[inventorySelection];
    }

    public int getAmount() {
        return inventoryNum[inventorySelection];
    }

    public String itemType(){
        if(inventoryNum[inventorySelection] instanceOf Weapon){
            return "Weapon";
        } else if(inventoryNum[inventorySelection] instanceOf Block){
            return "Block";
        } else if(inventoryNum[inventorySelection] instanceOf Food){
            return "Food";
        } else {
            return "Armor";
        }
        
    }
    
    public String toString() {
        String returnString = "";
        for (int i = 0; i < maxItems; i++) {
            if (inventoryNum[i] > 0) {
                returnString += inventory[i].getName() + ": " + inventoryNum[i];
                returnString += "\n";
            }
        }
        return returnString;
    }

}
