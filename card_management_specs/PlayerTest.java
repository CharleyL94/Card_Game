import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_management.*;

public class PlayerTest {

  Player player;
  Hand hand;

// Default example
  @Before
  public void before(){
    player = new Player("Charley");
    // hand = new Hand(SuitType.SPADES, RankType.ACE);
  }

// Test getName method
  @Test
  public void canNamePlayer(){
    assertEquals("Charley", player.getName());
  }

  // @Test
  // public void canGetHand(){
  //   assertEquals(player.getHand, ());
  // }
}