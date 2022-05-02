/**
* Names:  Larry Li
          Shairahavan Selvachandran
          Kevin Yao
          Cyrus Yang
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled (very bare bones).
*/

public class Character {
  
  private int health;
  private int hunger;
  private int xp;
  private boolean dead = false;
  
  private final int MAX_HEALTH = 20;
  private int MAX_HUNGER = 20;

  
  /*
  private int xPosition;
  private int yPosition;
  private int zPosition;
  */
  
  public Character (){
    this.health = 20;
    this.hunger = 20;
    this.xp = 0;
  }

  public void takeDamage(int amount){
    health -= amount;
    if(health <= 0){
      dead = true;
      }
  }

  public void heal(int amount){
    health =+ amount;
    if(health > MAX_HEALTH){
      health = MAX_HEALTH;
    }
  }

  public void getHungry(int amount){
    hunger -= amount;
    if (hunger < 0){
      hunger = 0;
      hungerbarempty = true;
    }
    if(hunger <= 0){
      takeDamage(4);
      }
    else if (hunger > 0){
      hungerbarempty == false;
    }
  }

  public void eat(int amount){
    hunger =+ amount;
    if(hunger > MAX_HUNGER){
      hunger = MAX_HUNGER;
    }
  }

  public String toString(){
    String output = "";
    output += "Health: ";
    output += health;
    output += "\nHunger: ";
    output += hunger;
    output += "\nXP: ";
    output += xp;
  }
  
}