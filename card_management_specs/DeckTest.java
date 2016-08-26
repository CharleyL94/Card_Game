import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_management.*;

public class DeckTest {

  Deck deck;

// default example of a full deck
  @Before
  public void before() {
    deck = new Deck(); 
  }

//test build deck method 
  @Test
  public void canBuildDeck(){
    assertEquals(deck.getCards().size(),52);
  }
// test shuffle method
  // @Test
  // public void canShuffleDeck(){
  //   Card cards = deck.get(14);
  //   deck.shuffle();
  //   assertEquals(false, cards == deck.get(14));
  // }


}