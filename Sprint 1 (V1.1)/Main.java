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
      
      
      //Spawn items
      
      //creating blocks
      Block block = new Block("Stone", 10, 20, 100); 
      
      //breaking blocks with 10 pickaxe power
      player1.mineBlock(22, 93, 10);
      player1.mineBlock(24, 93, 10);
      player1.mineBlock(29, 93, 10);
      player1.mineBlock(12, 93, 10);
      //Spawn mobs
      
      
      
   
      //Testing character related methods (weapons and food as well)
      
      //move
      player1.move(20, 23);
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