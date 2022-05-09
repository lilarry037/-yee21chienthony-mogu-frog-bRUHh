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
      startingX = (int)(Math.random(0, MAX_X)); //or put fixed values for simplicity
      startingY = (int)(Math.random(0, MAX_Y));
      
      System.out.print("What is your name: ");
      name = sc.nextLine();
      System.out.println();
      
      Character player1 = new Character(name, startingX, startingY);
      
      // Spawn Inventory
      
      
      //Spawn items
      
      
      //Spawn blocks
      
      
      //Spawn mobs
      
      
      
   
      //Testing character related methods (weapons and food as well)
      
      //move
      player1.becomeHungry(4);   
      System.out.println(player1.getHunger);
      //spawn item
      player1.farm(resource)
      //spawn mob
      //get damaged
      player1.attack(pickaxe1, mob1);
      player1.attack(bow1, mob1);
      player1.eat(food);
      player1.heal(2);
      System.out.println(player1.getHunger);
      System.out.println(player1.getHealth);
      
      //Testing item related methods
      
   
      //Testing block related methods
      
   
      //Testing mining and inventory methods
      
   
      //Testing moving and world builder methods
      
      
      //Killing the character
      player1.die();  
   }
}