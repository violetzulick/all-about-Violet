public class DeadboltDoor implements Door{
  /*
  * neccessary instance field variables
  */
  private boolean bolt1;
  private boolean bolt2;

  public DeadboltDoor(){
    int random = (int) (Math.random() * 2);
    if(random == 0){
      bolt1 = true;
    } else {
      bolt1 = false;      
    }
    random = (int) (Math.random() * 2);
    if(random != 0){
      bolt2 = true;
    } else {
      bolt2 = false;      
    }
  }

  /**
  * @return a String about the characteristic of the door
  */
  @Override
  public String examine(){
    return "You encounter a door with two deadbolts. \nBoth need to be unlocked for the door to open, but you can’t tell if they are locked or unlocked.";
  }

  /**
  * @return a String with the menu options for the door
  */
  @Override
  public String menu(){
    return "1. Toggle Bolt 1 \n2. Toggle Bolt 2";
  }
 /**
  * @return an int with the highest menu number
  */
  @Override
  public int getMenuMax(){
    return 2;
  }

  /**
  * tries to unlock the door
  * @param int option, what menu option the user chose
  * @return a String about what the user did
  */
  @Override
  public String unlock(int option){
    if(option == 1){
      if(bolt1 == false){
        bolt1 = true;
      } else {
        bolt1 = false;
      }
      return "You toggle the first deadbolt.";
    } else {
      if(bolt2 == false){
        bolt2 = true;
      } else {
        bolt2 = false;
      }
    }
    return "You toggle the second deadbolt";
  }

  /**
  * checks if the door is unlocked
  * @return a boolean representing if the door is unlocked
  */
  @Override
  public boolean open(){
    if(bolt1 == true && bolt2 == true){
      return true;
    }
    return false;
  }

  /**
  * @return a String that gives the user a clue
  */
  @Override
  public String clue(){
    if(bolt1 == true || bolt2 == true){
      return "One is in the correct position.";
    }
    return "None are in the correct position.";
  }

  /**
  * @return a String that tells the user the door has opened
  */
  @Override
  public String success(){
    return "Congratulations, you opened the Dead-Bolt door.";
  }
}