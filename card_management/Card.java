package card_management;
import card_management.*;
import java.util.*;

public class Card{
  SuitType suit;
  RankType rank;

  public Card(SuitType suit, RankType rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public SuitType getSuit(){
    return suit;
  }

  public RankType getRank(){
    return rank;
  }

    // public String toString() {
    //   return rank.toString() + " of " + suit.toString();
    // }


}