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
      Inventory inv = new Inventory();
      
      //Spawn items
      Weapon pickaxe1 = new Weapon ("wood pickaxe", 274, 1, 1, 5, 20);  // make a melee weapon
      Weapon pickaxe2 = new Weapon ("diamond pickaxe", 278, 1, 5, 5, 20);  // make a melee weapon
      Weapon bow1 = new Weapon ("bow", 261, 1, 5, 25, 20);  // make a range weapon
      
      //add items to inventory
      inv.addItem(pickaxe1, 1, 0);
      inv.addItem(pickaxe2, 1, 1);
      inv.addItem(bow1, 1, 2);
      

      //breaking blocks with different pickaxes
      //select the wood pickaxe
      inv.changeSelection(1);
      
      //add a mined block to the inventory
      inv.addItem(player1.mineBlock(22, 93, ((((Weapon)inv.getItem())).getDamage())), 1, 3);
      inv.addItem(player1.mineBlock(24, 93, ((((Weapon)inv.getItem())).getDamage())), 1, 4);

      inv.changeSelection(2);
      
      inv.addItem(player1.mineBlock(29, 93, ((((Weapon)inv.getItem())).getDamage())), 1, 3);
      inv.addItem(player1.mineBlock(12, 93, ((((Weapon)inv.getItem())).getDamage())), 1, 6);
      
      
      System.out.println(inv.toString());
   
      //Testing character related methods (weapons and food as well)
      
      player1.move(20, 23); // testing movement
      player1.becomeHungry(5);  // testing hunger 
      
      
      //Spawn mobs
      Mob mob1 = new Hostile_Mob("creeper", 5, 20, 29, "sword"); // create mob
      Mob mob2 = new Passive_Mob ("pig", 5, 20, false); // create mob
      Mob mob3 = new Hostile_Mob("creeper", 5, 20, 29, "sword"); // create mob
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
      player1.takeDamage(20);  // test damage taken
      Boolean killedbymob = true;
       System.out.println(Condition(name, false, killedbymob, false));
     
      System.exit(0);
   }
}
