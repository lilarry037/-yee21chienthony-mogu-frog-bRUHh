/**
* Names:  Larry Li
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: write this later
*/

public class Inventory {

  /*
  private int width;
  private int height;
  */
  
  //temp
  private int maxItems;

  public Inventory(maxItems){
    this.maxItems = maxItems;
  }
  /*
  public Inventory (width, height){
    this.width = width;
    this.height = height;
      
    }
  */
  
  /*
  int[][] numOfObject = new int[width][height];
  int[][] referenceNum = new int[width][height];
  */

  int[] numItems = new int[maxItems];
  Item[] inventory = new Item[maxItems];

  public boolean addItem(int amount, int refNum){
    for(int i = 0; i< maxItems; i++){
      if(inventory[i].getItemID = refNum){
        if(numItems[i] + amount <= Inventory[i]){
          
        }
      }
    }

    
  }

  
}
