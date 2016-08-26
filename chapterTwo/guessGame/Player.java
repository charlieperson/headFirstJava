import java.util.Scanner;

public class Player {
  String mName;
  int mGuess;

  Player() {
    setName();
    setGuess();
  }

  private void setName() {
    Scanner name_input = new Scanner( System.in );
    System.out.println("What's your name?");
    String name = name_input.next( );
    mName = name;
  }

  void setGuess() {
    Scanner guess_input = new Scanner( System.in );
    System.out.println("Hey " + mName + "! feelin' lucky punk?? Take a guess!");
    String input = guess_input.next( );
    mGuess = Integer.parseInt(input);
  }


}
