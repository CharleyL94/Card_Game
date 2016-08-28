package card_management;
import card_management.*;
import java.util.*;


public class Deck{


  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();  
  }

  public void buildDeck(){
    for( SuitType suit : SuitType.values()) {
      for ( RankType rank : RankType.values()){
        deck.add(new Card(suit, rank));
      }
    }
  }

  public ArrayList<Card> getCards(){
    return this.deck;
  }

  public int getDeckSize(){
    return deck.size();
  }

  public void shuffle(){
    Collections.shuffle(deck);
  }

  public void dealCard() {
     Card card = deck.remove(0);
   }

  // Unsure what to name in brackets- currently not working 
  // public void printDeck(){
  //   for( Card card : deck){
  //     deck.printCard();
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