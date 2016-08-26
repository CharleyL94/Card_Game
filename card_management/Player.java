package card_management;
import card_management.*;
import java.util.*;

public class Player{

  String name;
  Hand hand;

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }
}