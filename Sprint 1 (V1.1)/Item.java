/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Creates an item in Minecraft.
*/

public class Item {

    /*
       Attributes
    */

    /** the name of the item */
    private String name;

    /** the ID of the item */
    private int itemID;

    /** the maximum number of items in a stack */
    private int maxStack;

    /*
       Constructor
    */

    /**
     * Item
     * Creates an item in minecraft.
     * @param name: the name of the item
     * @param itemID: the ID of the item
     * @param maxStack: the maximum number in a stack for the item 
     */
    public Item(String name, int itemID, int maxStack) {
        this.name = name;
        this.itemID = itemID;
        this.maxStack = maxStack;
    }

    /*
    Methods
    */

    //Accessors

    /**
     * Gets the name of item
     * @return the item's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the ID of item
     * @return the item's ID
     */
    public int getItemID() {
        return this.itemID;
    }

    /**
     * Gets the maximum stack allowable for the item
     * @return the item's mazimum stack
     */
    public int getMaxStack() {
        return this.maxStack;
    }

    // Mutators

    /**
     * changes name of an item
     * @param newName - new name of the item
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * changes ID of the item
     * @param newID - new ID of item
     */
    public void setItemID(int newItemID) {
        this.itemID = newItemID;
    }

    /**
     * changes the maximum amount allowable for a stack of the item
     * @param newMaxStack - new max stack of item
     */
    public void setMaxStack(int newMaxStack) {
        this.maxStack = newMaxStack;
    }

    // Methods

    /**
     * toString
     * Returns a string with the attributes of the item.
     * @return returnString: 
     */
    public String toString() {
        String returnString = "Name: " + this.name + "\nItem number: #" + this.itemID + "\nMax Stack: " + this.maxStack;

        return returnString;
    }
}
