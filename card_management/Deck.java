package card_management;
import card_management.*;
import java.util.*;


public class Deck{


  private ArrayList<Card> cards;

  public Deck(){
    this.cards = new ArrayList<Card>();  
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

  public int getDeckSize(){
    return cards.size();
  }

  public void shuffle(){
    Collections.shuffle(cards);
  }

  // public void printDeck(){
  //   for( Card card : cards){
  //     // card.printCard();
  //   }
  // }

// deal method can't get this mthod to work- would like to go over a counter
  // public void deal(){
  //   deck.fullDeck();
  //   for (int i = 0; i < 2; i++){
  //     for (Player player : player){
  //       player.getHand().recieveACard(deck.dealACard());
  //     }
  //   }
  // }

  
}