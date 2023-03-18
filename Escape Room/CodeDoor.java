public class CodeDoor implements Door{
  /*
  * neccessary instance field variables
  */
  private char[] keys = new char[8];
  private char[] code = new char[8];

  public CodeDoor(){
     for(int i = 0; i < keys.length; i++){
       int random = (int) (Math.random() * 1000);
       if(random < 400){
         keys[i] = 'O';
       } else {
         keys[i] = 'X';
       }
       code[i] = 'O';
     }
    
  }

  /**
  * @return a String about the characteristic of the door
  */
  @Override
  public String examine(){
    return "You enocounter a door with a coded keypad with eight characters. \nEach key toggles a value with X or O";
  }

  /**
  * @return a String with the menu options for the door
  */
  @Override
  public String menu(){
    return "Enter which key you want to toggle (1-8): ";
  }
  /**
  * @return an int with the highest menu number
  */ 
  @Override
  public int getMenuMax(){
    return 8;
  }

  /**
  * tries to unlock the door
  * @param int option, what menu option the user chose
  * @return a String about what the user did
  */
  @Override
  public String unlock(int option){
    if(code[option-1] == 'O'){
      code[option-1] = 'X';
    } else {
      code[option-1] = 'O';
    }
    return "You toggled key " + Integer.toString(option);
  }

  /**
  * checks if the door is unlocked
  * @return a boolean representing if the door is unlocked
  */
  @Override
  public boolean open(){
    for(int i = 0; i < keys.length; i++){
      if(keys[i] != code[i]){
        return false;
      }
    }
    return true;
  }

  /**
  * @return a String that gives the user a clue
  */
  @Override
  public String clue(){
    int correct = 0;
    for(int i = 0; i < keys.length; i++){
      if(keys[i] == code[i]){
        correct++;
      }
    }
    String output = "Number of correct items: " + Integer.toString(correct);
    return output;
  }

  /**
  * @return a String that tells the user the door has opened
  */
  @Override
  public String success(){
    return "Congratulations, you opened the Code door.";
  }
    
}