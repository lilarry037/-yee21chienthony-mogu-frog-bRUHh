/**
* Names: Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Block generator class
*/

public class Block extends Item{
   /*
    Attributes
   */
  
   /** the x coordinate of the block */
   private int x;
	
   /** the y coordinate of the block */	
   private int y;
	
   /** the durability of the block */	
   private int durability;
	
        /**
        * Block
   	* Description: Constructor to create a block at a location with durability, ID, and maxStack
    	* @param name: subclass under item, so takes in a name
	* @param itemID: subclass under item, so takes in an ID
	* @param maxStack: subclass under item, so has a maxStack
	* @param x: x coordinate of where the block is going to be spawned
	* @param y: y coordinate of where the block is going to be spawned
	* @param durability: the "hp" of a block to work with a pickaxe to determine how many hits a block will take to break
    	*/
	public Block(String name, int itemID, int maxStack, int x, int y, int durability) {
	  
		super(name, itemID, maxStack);
		
		this.x = x;
		this.y = y;
		this.durability = durability;
	}
   
   /*
      Accessors
   */
	
   /**
   Gets the x coordinate of the block
   @return the x coordinate of the block
   */
   public int getX() {
      return this.x;
   }
   
   /**
   Gets the y coordinate of the block
   @return the y coordinate of the block
   */
   public int getY() {
      return this.y;
   }
   
   /**
   Gets the durability of the block
   @return the durability of the block
   */
   public int getDurability() {
      return this.durability;
   }
   
   /*
      Mutators
   */
   
   /**
   Sets the new location of the block
   @param newX: new x coordinate of the block
   @param newY: new y coordinate of the block
   */
   public void setPlace(int newX, int newY) {
      this.x = newX;
      this.y = newY;
   }
	
   /**
   Changes the block durability to a new durability value
   @param newDurability: new durability of the block
   */
   public void setDurability(int newDurability) {
      this.durability = newDurability;
      if (this.durability < 0) { //If the blocks breaks
         System.out.println("Block destroyed");
      }
   }
   
   /**
   Creates a list of standard block objects to use for generation in the Overworld
   @return the list of blocks
   */
   public static Block[] listOfBlocks() {
      //an array of blocks to be returned
      Block[] listOfBlocks = new Block[7]; 
      listOfBlocks[0] = new Block("Dirt", 1, 64, 0, 0, 20);
      listOfBlocks[1] = new Block("Stone", 2, 64, 0, 0,  50); 
      listOfBlocks[2] = new Block("Gravel", 3, 64, 0, 0,  0);
      listOfBlocks[3] = new Block("Sand", 4, 64, 0, 0,  10);
      listOfBlocks[4] = new Block("Iron", 5, 64, 0, 0,  100);
      listOfBlocks[5] = new Block("Coal", 6, 64, 0, 0,  100);
      listOfBlocks[6] = new Block("Coal", 6, 64, 0, 0,  100);
      
      return listOfBlocks;
   }
   
   /**
   Breaks a block
   @param x: x coordinate of block to break
   @param y: y coordinate of block to break
   @param pickPower: power of pickaxe to break the block
   @param durability: durability of block (this shouldnt have been necessary but I couldn't find a way to reference a block's attributes from in the overworld grid) 
   */
   public void breakBlock(int x, int y, int pickPower, int durability) {
         
       int numberOfHitsToBreak = durability/pickPower;

       if (numberOfHitsToBreak < 0) {
         numberOfHitsToBreak = 0;
       }
       
       //the block will Clang everytime it gets hit
       for(int i = 0; i < numberOfHitsToBreak; i++) {
         System.out.println("Clang");
       }
	   
       //Outputting which block was mined and how long it took
       System.out.println("The block at x:" + x + " and y:" + y + " was mined!");
       System.out.println("It took " + numberOfHitsToBreak + " hit(s) to mine the block!");
   } 
 } 
 	
