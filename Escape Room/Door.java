public interface Door{
  /**
  * @return a String about the characteristic of the door
  */
  public String examine();
  /**
  * @return a String with the menu options for the door
  */
  public String menu();
  /**
  * @return an int with the highest menu number
  */
  public int getMenuMax();
  /**
  * tries to unlock the door
  * @param int option, what menu option the user chose
  * @return a String about what the user did
  */
  public String unlock(int option);
  /**
  * checks if the door is unlocked
  * @return a boolean representing if the door is unlocked
  */
  public boolean open();
  /**
  * @return a String that gives the user a clue
  */
  public String clue();
  /**
  * @return a String that tells the user the door has opened
  */
  public String success(); 
}