/**
* Names: Shairahavan Selvachandran, Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

import java.util.*;

class Main {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      String name;
      
      // Create character
      
      System.out.print("What is your name: ");
      name = sc.nextLine();
      System.out.println();
      
      Character player1 = new Character(name, 100, 0, 0);
      
      // Create overworld
      Overworld.createWorld(player1);
      
      // Spawn Inventory
      Inventory inv = new Inventory(12);
      
      //Spawn items
      Weapon pickaxe1 = new Weapon ("diamond pickaxe", 278, 1, 5, 5, 20);  // make a melee weapon
      Weapon bow1 = new Weapon ("bow", 261, 1, 5, 25, 20);  // make a range weapon
      
      inv.addItem(pickaxe1, 1);
      inv.addItem(bow1, 1);
      
      //creating blocks
      Block block = new Block("Stone", 10, 20, 100); 
      
      //breaking blocks with 10 pickaxe power
      player1.mineBlock(22, 93, 10);
      player1.mineBlock(24, 93, 10);
      player1.mineBlock(29, 93, 10);
      player1.mineBlock(12, 93, 10);
      
      
      //Spawn mobs
      
      
   
      //Testing character related methods (weapons and food as well)
      
      player1.move(20, 23); // testing movement
      player1.becomeHungry(5);  // testing hunger 
      
      Mob mob1 = new Mob("creeper", 5, 20, 29); // create mob
      player1.takeDamage(5);  // test damage taken
      

      
      player1.attack(pickaxe1, mob1);  // attack using melee (testing out of range feature)
      
      // attack using bow (4 times to kill mob)
      player1.attack(bow1, mob1);
      player1.attack(bow1, mob1);
      player1.attack(bow1, mob1);
      player1.attack(bow1, mob1);
      
      // create two different foods and eat them
      Food food1 = new Food("egg", 344, 12, 1, 0);
      player1.eat(food1);
      Food food2 = new Food("chicken", 10, 5, 2, 0);
      player1.eat(food2);
      
      player1.heal(2);  // test healing feature
      
      System.out.println(player1.toString());   // test toString (show attributes after all changes
      
      //Testing item related methods
      
   
      //Testing block related methods
     
   
      //Testing mining and inventory methods
      
   
      //Testing moving and world builder methods
      
      
      //Killing the character
      //Death messages + conditions
      System.exit(0);
   }
}
