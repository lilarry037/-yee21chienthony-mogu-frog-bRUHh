import java.util.*;

class Main {
   public static void main(String[] args) {
      
      private int MAX_X = 10;
      private int MAX_Y = 10;
      
      Scanner sc = new Scanner(System.in);
      
      int startingX, startingY;
      String name;
      
      // Create overworld
      
      
      // Create character
      startingX = (int)(Math.random(0, MAX_X));
      startingY = (int)(Math.random(0, MAX_Y));
      
      System.out.print("What is your name: ");
      name = sc.nextLine();
      System.out.println();
      
      Character player1 = new Character(startingX, startingY);
      
      // Spawn Inventory
      
      
      //Spawn items
      
      
      //Spawn blocks
      
      
      //Spawn mobs
      
      
      
   
      //Testing character related methods
      
   
      //Testing item related methods
      
   
      //Testing block related methods
      
   
      //Testing mineing and inventory methods
      
   
      //Testing character methods again
      
   
      //Testing moving and world builder methods
      
      
      //Killing the character
      player1.die();  
   }
}