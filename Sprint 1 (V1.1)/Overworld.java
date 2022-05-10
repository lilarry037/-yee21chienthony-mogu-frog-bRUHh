/**
* Names: Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Creates an Overworld
*/
public class Overworld {
      
    public static void createWorld(Character player) {
        //Creating an array of blocks for the overworld thats related to the block class
        Block[] listOfBlocks;
        Block[] createdBlocks = new Block[7]; 
        createdBlocks = Block.listOfBlocks();
        
        //Making a 1000 by 1000 grid for the world
        Block[][] world = new Block[1000][1000];
          
        //Random number generator 
        int randomNumber = (int)(Math.random() * ((6 - 0) + 1)) + 0;
        
        //For loop to get a random number and get a block based on that number
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                //Adding a random block to the grid
                world[i][j] = createdBlocks[randomNumber]; 
            }  
        }
          
        //Notifying the player that the world has been created 
        System.out.println("The World has been created! You can feel free to move around and break things.");
    }
}
