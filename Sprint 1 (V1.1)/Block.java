/**
* Names: Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

public class Block {
   
   private String name;
   private int x;
   private int y;
   private int durability;
   
	public Block(String name, int x, int y, int durability) {
		this.x = x;
      this.y = y;
      this.durability = durability;
	}
   
   /*
      Accessors
   */
   
   public String getName() {
      return this.name;
   }
   
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public double getDurability() {
      return this.durability;
   }
   
   /*
      Mutators
   */
   
   public void setName(String newName) {
      this.name = newName;
   }
   
   public void setPlace(int newX, int newY) {
      this.x = newX;
      this.y = newY;
   }
   
   public void setDurability(int newDurability) {
      this.durability = newDurability;
      if (this.durability < 0) { //If the blocks breaks
         System.out.println("Block destroyed");
      }
   }
   
  
   //Basic list of blocks for the overworld
   public static Block[] listOfBlocks() {
      //List of blocks that is returned
      Block[] listOfBlocks = new Block[7]; 
      listOfBlocks[0] = new Block("Dirt", 0, 0, 20);
      listOfBlocks[1] = new Block("Stone", 0, 0, 100); 
      listOfBlocks[2] = new Block("Gravel", 0, 0, 0);
      listOfBlocks[3] = new Block("Sand", 0, 0, 10);
      listOfBlocks[4] = new Block("Iron", 0, 0, 100);
      listOfBlocks[5] = new Block("Coal", 0, 0, 100);
      listOfBlocks[6] = new Block("Coal", 0, 0, 50);
      
      return listOfBlocks;
   }
   
   //Breaking a block
   public void breakBlock(int x, int y, int pickPower, int durability) {
         
       int numberOfHitsToBreak = durability/pickPower;

       if (numberOfHitsToBreak < 0) {
         numberOfHitsToBreak = 0;
       }
       
       //the block will Clang everytime it gets hit
       for(int i = 0; i < numberOfHitsToBreak; i++) {
         System.out.println("Clang");{
       }
       //Outputting which block was mined and how long it took
       System.out.println("The block at x:" + x + " and y:" + y + " was mined!");
       System.out.println("It took " + numberOfHitsToBreak + " hit(s) to mine the block!");
   } 
 }  	
}
