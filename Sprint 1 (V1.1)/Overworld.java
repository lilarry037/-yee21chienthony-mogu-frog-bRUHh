public class Overworld {
      
    public static String createWorld(Character player) {
        //Creating instances of blocks that can be used to generate terrain
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
                //Adding the random block to the grid
                world[i][j] = createdBlocks[randomNumber]; 
            }  
        }
        
        //Printing the users coordinates
        String locationInWorld = "Your coordinates: " + player.getX() + " " + player.getY() + "(You are on a " + world[player.getX()][player.getY()].getName() + " block.";
        return locationInWorld;
    }  
}