public class ComboDoor implements Door {
  /*
  * neccessary instance field variables
  */
  private int comboValue;
  private int guess;
  
  public ComboDoor(){
    int random = (int) (Math.random() * 899)+100;
    comboValue = random;
    guess = 0;
  }

  /**
  * @return a String about the characteristic of the door
  */
  @Override
  public String examine(){
    return "You encounter a door with a combination lock.";
  }

  /**
  * @return a String with the menu options for the door
  */
  @Override
  public String menu(){
    return "Enter a 3 single-digit combination in format: xyz";
  }
 /**
  * @return an int with the highest menu number
  */
  @Override
  public int getMenuMax(){
    return 999;
  }

  /**
  * tries to unlock the door
  * @param int option, what menu option the user chose
  * @return a String about what the user did
  */
  @Override
  public String unlock(int option){
    guess = option;
    return "You turn the dial to " + Integer.toString(guess);
  }

  /**
  * checks if the door is unlocked
  * @return a boolean representing if the door is unlocked
  */
  @Override
  public boolean open(){
    if(comboValue == guess){
      return true;
    }
    return false;
  }

  /**
  * @return a String that gives the user a clue
  */
  @Override
  public String clue(){
    if(guess > comboValue){
      return "You note a little too much resistance, try a lower value.";
    }
    return "You don't feel enough resistance for the pin to drop, try a higher value.";
  }

  /**
  * @return a String that tells the user the door has opened
  */
  @Override
  public String success(){
    return "Congratulations, you unlocked and opened the Combo door.";
  }
}