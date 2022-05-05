/**
 * Name: Cyrus Yang
 * Teacher: Mr Lee
 * Date: April 30th 2022
 * Object: Death Message SuperClass
 * Description: Creating a Super class for Death Messages
 */

// Super class for Death Messages
public class Condition extends Death_Message_Main {
    /*
    Tank Attributes:
    List of Contained Variables
    everything in vehicle class
    weapons :  String
     */

     /* name of the vehicle
    */
    /* the weapons used for the tank
    */
    public boolean hungerbarempty;

    /* name of the vehicle
    */
    /* the weapons used for the tank
    */
    private boolean killedbymob;

     /* name of the vehicle
    */
    /* the weapons used for the tank
    */
    private boolean falldamage;

    /* name of the vehicle
    */
    /* the weapons used for the tank
    */
    private String helpMessage;

  /*
    * Constructor - sets up the values
    * to become vegtables
    */
    
    public Condition(){
    super();
      this.hungerbarempty = false;
      this.killedbymob = false;
      this.falldamage = false;
    }

        //this completely sets up the tank with every single attachment and parts together
	  public Condition(String playerName, boolean hungerbarempty,boolean killedbymob, boolean falldamage) {
        super(playerName);

      if ((hungerbarempty == true) && (killedbymob == false) && (falldamage == false)){
        this.helpMessage = "One simply does not attempt the African Diet - Some Obese American";
        }
          else if (falldamage == false){
        this.helpMessage = "You Suck at Combat - Kilgore";
        }
          else if(falldamage == true){
            this.helpMessage = "Mind the Gap -London Underground";
          }
          else {
            this.helpMessage = "You died like a scrub - Mr lahey";
          }
    }

  /*
    Methods
    The the part where the death message is expanded
    */

  // Method to print out information details
   public String toString() {
      return super.toString() + helpMessage;
  }
}
