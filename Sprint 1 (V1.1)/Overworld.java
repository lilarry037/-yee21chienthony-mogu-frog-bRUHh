public class Overworld {

public WorldBuilder(){ //Allows you to make an instance of the class
    }
    
      
    public static String createWorld(Character c1) {
        //Creating instances of blocks that can be used to generate terrain
        Block[] blocks;
        Block[] createdBlocks = new Block[4]; 
        createdBlocks = Block.listOfBlocks();
        
        //Making a 1000 by 1000 grid for the world
        PlacedBlock[][] generatedBlocks = new PlacedBlock[1000][1000];
        //Random number generator 
        Random randomNumber = new Random();
        int answer;
        
        //For loop to get a random number and get a block based on that number
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                answer = rn.nextInt(4);
                //Adding the random block to the grid
                generatedBlocks[i][j] = createdBlocks[answer]; 
            }  
        }
        
        String world = "";
        
        //Printing the users coordinates
        world += "Your coordinates: " + c1.getX() + " " + c1.getY() + "(You are on)\n";
        
        //for loop to make the actual output from the type of blocks that were randomly generated
        for (int i = 0; i < 3; i++) { //Could make a second for loop to make it make a larger terrain
            //world += generatedBlocks[i][0].getType() + "|" + generatedBlocks[i][1].getType() + "|" + generatedBlocks[i][2].getType() + "\n";
            //world += "----------------\n";
        } 

        return world;
    }  
}