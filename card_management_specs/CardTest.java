import static org.junit.Assert.*;
import org.junit.*;
import card_management.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(SuitType.SPADES, RankType.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(card.getSuit(), SuitType.SPADES);
  }

  @Test
  public void canGetRank(){
    assertEquals(card.getRank(), RankType.ACE);
  }


}