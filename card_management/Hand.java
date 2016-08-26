package card_management;
import java.util.*;

public class Hand{

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

//hand recieves a card 
  public void reacieveACard(Card card){
    hand.add(card);
  }

// hand only has 2 cards
  public void checkHandSize(Card card){
    hand.size();
  }
}