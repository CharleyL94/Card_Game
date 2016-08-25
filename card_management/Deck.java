package card_management;
import card_management.*;
import java.util.*;


public class Deck{

// private Card[] cards;
  private ArrayList<Card> cards;

  public Deck(){
  // this.cards = new Card [52];
    this.cards = new ArrayList<Card>();
    buildDeck();
  }

  public void buildDeck(){
    for( SuitType suit : SuitType.values()) {
      for ( RankType rank : RankType.values()){
        cards.add(new Card(suit, rank));
      }
    }
  }

  public ArrayList<Card> getCards(){
    return this.cards;
  }

  public void shuffle(){
    Collections.shuffle(cards);
  }
}