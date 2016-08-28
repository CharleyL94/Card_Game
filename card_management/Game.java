 package card_management;
 import card_management.*;
 import java.util.*;

public class Game{

  // private ArrayList<Players> player;
  private Player player;
  private Deck deck;

  public Game(Player player, Deck deck){
    this.player = player;
    this.deck = deck;
  }

  // calculate hand
// and compare
  // pint winner

  public void beginGame(){
    deck.shuffle();
  }

  // String name1 = getName();
  // Player player1 = new Player(name1);

  // String name2 = getName();
  // Player player2 = new Player(name2);
}