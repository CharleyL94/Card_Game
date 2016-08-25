import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_management.*;

public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck(); 
  }

  @Test
  public void canBuildDeck(){
    assertEquals(deck.getCards().size(),52);
  }

  // @Test
  // public void canShuffleDeck(){
  //   Card cards = deck.get(14);
  //   deck.shuffle();
  //   assertEquals(false, cards == deck.get(14));
  // }


}