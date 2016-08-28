package card_management;
import card_management.*;
import java.util.*;

public class Player{


  String name;
  Hand hand;

  public Player(String name){
    this.name = name;
  }

// get name method
  public String getName(){
    return this.name;
  }

// set hand method
  
// get hand method
  public Hand getHand(){
    return this.hand;
  }

  // public void printHand(){
  //   hand = getHand();
  //   for (Card card : hand) {
  //     card.printCard();
  //   }
  //   System.out.println();
  // }
}