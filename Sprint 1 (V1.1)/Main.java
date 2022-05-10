import java.util.*;

class Main {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      String name;
      
      // Create overworld
      
      
      // Create character
      
      System.out.print("What is your name: ");
      name = sc.nextLine();
      System.out.println();
      
      Character player1 = new Character(name, 100, 100);
      
      // Spawn Inventory
      
      
      //Spawn items
      
      
      //Spawn blocks
      
      
      //Spawn mobs
      
      
      
   
      //Testing character related methods (weapons and food as well)
      
      //move
      player1.becomeHungry(4);   
      System.out.println(player1.getHunger());
      //spawn item
      //player1.farm(weapon, block);
      //spawn mob
      //get damaged
      //player1.attack(pickaxe1, mob1);
      //player1.attack(bow1, mob1);
      //player1.eat(food);
      player1.heal(2);
      System.out.println(player1.getHunger());
      System.out.println(player1.getHealth());
      
      //Testing item related methods
      
   
      //Testing block related methods
     
   
      //Testing mining and inventory methods
      
   
      //Testing moving and world builder methods
      
      
      //Killing the character
      //Death messages + conditions
      System.exit(0);
   }
}