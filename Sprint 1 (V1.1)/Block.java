/**
* Names: Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

public class Block extends Item{
   
   public int x;
   public int y;
   public int z;
   
	public Block(String name, int itemID, int maxStack, int x, int y, int z) {
		super(name, itemID, maxStack);
		this.x = x;
      this.y = y;
      this.z = z;
	}
  
   /*
      Methods
   */
   
	//Accessors
   
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public int getZ() {
      return this.z;
   }
   
   //Setters
   
   public void setX(int newX) {
      this.x = newX;
   }
   
   public void setY(int newY) {
      this.y = newY;
   }
   
   public void setZ(int newZ) {
      this.z = newZ;
   }
	
}
