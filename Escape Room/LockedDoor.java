public class LockedDoor implements Door{
  /*
  * neccessary instance field variables
  */
  private int keyLocation;
  private int searchOption;

  public LockedDoor(){
    int random = (int) (Math.random() * 3);
    keyLocation = random;
    searchOption = 0;
  }

  /**
  * @return a String about the characteristic of the door
  */
  @Override
  public String examine(){
    return "You encounter a door that can be opened with a key. \nLook around to see if you can find it.";
  }

  /**
  * @return a String with the menu options for the door
  */
  @Override
  public String menu(){
    return "1. Look under mat \n2. Look under the flower pot \n3. Look under the fake rock";
  }

  /**
  * @return an int with the highest menu number
  */
  @Override
  public int getMenuMax(){
    return 3;
  }

  /**
  * tries to unlock the door
  * @param int option, what menu option the user chose
  * @return a String about what the user did
  */
  @Override
  public String unlock(int option){
    searchOption = option;
    if(option == 1){
      return "You look under the mat";
    } else if(option == 2){
      return "You look under the flower pot";
    }
    return "You look under the fake rock";
  }

  /**
  * checks if the door is unlocked
  * @return a boolean representing if the door is unlocked
  */
  @Override
  public boolean open(){
    if(keyLocation == searchOption){
      return true;
    }
    return false;
  }

  /**
  * @return a String that gives the user a clue
  */
  @Override
  public String clue(){
    return "You find only dust, try another location.";
  }

  /**
  * @return a String that tells the user the door has opened
  */
  @Override
  public String success(){
    return "Congratulations, you found the key and opened the Locked door.";
  }
}