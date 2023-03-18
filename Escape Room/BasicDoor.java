public class BasicDoor implements Door{
  /*
  * neccessary instance field variables
  */
  private boolean push;
  private boolean input;

  public BasicDoor(){
    int random = (int) (Math.random() * 2);
    if(random == 0){
      push = true;
    } else {
      push = false;
    }
    input = !push;
  }

  /**
  * @return a String about the characteristic of the door
  */
  @Override
  public String examine(){
    return "You encounter a basic door.";
  }

  /**
  * @return a String with the menu options for the door
  */
  @Override
  public String menu(){
    return "1. Push \n2. Pull ";
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
      input = true;
    } else {
      input = false;
    }
    if(input == true){
      return "You push the door";
    }
    return "You pull the door";
  }

  /**
  * checks if the door is unlocked
  * @return a boolean representing if the door is unlocked
  */
  @Override
  public boolean open(){
    if(push == input){
      return true;
    }
    return false;
  }

  /**
  * @return a String that gives the user a clue
  */
  @Override
  public String clue(){
    return "Try the other way.";
  }

  /**
  * @return a String that tells the user the door has opened
  */
  @Override
  public String success(){
    return "Congratulations, you opened the  door.";
  }
}