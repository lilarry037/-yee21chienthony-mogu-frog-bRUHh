/**
* Names: Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Creates an Overworld for the Character to move in
*/
public class Overworld {
    
    /**
    * createWorld
    * Description: Creates an Overworld for the Character to move in
    * @param player: takes in the Character class player object to use to check coordinates later
    */  
    public static void createWorld(Character player) {
        //Creating an array to hold all the basic types of blocks to generate a world
        Block[] listOfBlocks;
        Block[] createdBlocks = new Block[7]; 
        createdBlocks = Block.listOfBlocks();
        
        //Making a 1000 by 1000 grid for the world
        Block[][] world = new Block[1000][1000];
          
        //Random number generator 
        int randomNumber = (int)(Math.random() * ((6 - 0) + 1)) + 0;
        
        //For loop to get a random number and generate a block based on that number
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                //Adding the random block to the grid
                world[i][j] = createdBlocks[randomNumber]; 
            }  
        }
          
        //Message stating that the world has been created
        System.out.println("The World has been created! You can feel free to move around and break things. The player is currently at x: " + player.getX() + " and y: " + player.getY());

        //create certain blocks at certain locations for pickaxe demonstration
        world[22][93] = createdBlocks[1];
        world[24][93] = createdBlocks[1];
    }
}
