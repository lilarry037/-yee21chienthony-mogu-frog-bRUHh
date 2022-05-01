/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: April 30th 2022
 * Object: Death Message SuperClass
 * Description: Creating a Super class for Death Messages
 */

// Super class for Death Messages
public class Death_Message_Main {
    /*
    Death Message Attributes:
    Player Name
     */

     /* name of the vehicle
    */
    private String playerName;

  /*
    * Constructor - sets up the values
    * to become vegtables
    */
  
    //sets up the default settings of the tank (Unnamed)
	  public Death_Message_Main() {
      //general player information
      this.playerName = " ";
	}

    //this completely sets up the tank with every single attachment and parts together
	  public Death_Message_Main(String name){
      // this sets all string variables together
		this.playerName = name;
    }
  
		// Method to print out information details
      public String toString() {
    String output = "YOU ARE DEAD \n";
    output = output + playerName + "died\n" + "Cause of Death:" ;
  }
}