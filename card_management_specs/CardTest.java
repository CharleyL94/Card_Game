import static org.junit.Assert.*;
import org.junit.*;
import card_management.*;

public class CardTest {

  Card card;

//default card example 
  @Before
  public void before(){
    card = new Card(SuitType.SPADES, RankType.ACE);
  }

//getSuit method 
  @Test
  public void canGetSuit(){
    assertEquals(card.getSuit(), SuitType.SPADES);
  }

// getRank method
  @Test
  public void canGetRank(){
    assertEquals(card.getRank(), RankType.ACE);
  }


}