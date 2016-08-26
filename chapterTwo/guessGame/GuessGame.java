import java.util.Scanner;

public class GuessGame {
  boolean mWinner = false;
  int mSecretNum;
  int mNumOfPlayers;
  Player[] playerList;

  void startGame(){
    setPlayerAmount();
    mSecretNum = (int) (Math.random() * 10);
    playerList = new Player[mNumOfPlayers];
    for(int i=0; i<mNumOfPlayers; i = i+1){
      playerList[i] = new Player();
    }
    findWinner();
  }

  void setPlayerAmount() {
    Scanner user_input = new Scanner( System.in );
    System.out.println("How many we got playin'?");
    mNumOfPlayers = Integer.parseInt(user_input.next());
  }

  void findWinner() {
    for(int i=0; i<playerList.length; i = i+1){
      if(playerList[i].mGuess == mSecretNum) {
        mWinner = true;
        System.out.println(playerList[i].mName + " wins!!");
      } 
    }
    if(mWinner == false) {
      System.out.println("Nobody found it! Guess again!");
      rematch();
    }
  }

  void rematch() {
    for(int i=0; i<playerList.length; i = i+1){
      playerList[i].setGuess();
    }
    findWinner();
  }
}
