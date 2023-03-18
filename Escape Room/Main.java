
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Escape Room. Choose how many doors you would like to escape from: ");
    int userInput = CheckInput.getInt();

    for(int i = 0; i < userInput; i++){
      int choice = (int) (Math.random()*4) + 1;
      switch(choice){
        case 1:
          openDoor(new BasicDoor());
          break;
        case 2:
          openDoor(new CodeDoor());
          break;
        case 3:
          openDoor(new ComboDoor());
          break;
        case 4:
          openDoor(new DeadboltDoor());
          break;
        case 5:
          openDoor(new LockedDoor());
          break;
      }
    }
    System.out.println("Congratulations, you have escaped... for now.");
  }

  /**
  * Method that locks the user in and tests them to escape
  * @param Door d, is the door the user is trying to opem
  */
  static void openDoor(Door d){
    System.out.println();
    System.out.println(d.examine());
    System.out.println(d.menu());
    while(!d.open()){
      System.out.println(d.unlock(CheckInput.getIntRange(1, d.getMenuMax())));
      if(!d.open()){
        System.out.println(d.clue());
        System.out.println(d.menu());
      }
    }
    System.out.println(d.success());
  }
}