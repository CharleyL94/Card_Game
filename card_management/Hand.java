package card_management
import java.util.*

public class Hand{

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public void reacieveACard(Card card){
    hand.add(card);
  }
}