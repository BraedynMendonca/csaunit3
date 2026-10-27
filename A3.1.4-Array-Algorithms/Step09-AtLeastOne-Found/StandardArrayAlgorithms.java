public class StandardArrayAlgorithms
{
  // run the array algorithm
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 15),
      new Player("Bobbie", 18),
      new Player("Chris", 16)
    };
    boolean hasValue = false;
    int index = 0;
    // check each player until one matches
    while (!hasValue && index < players.length)
    {
      if (players[index].getAge() >= 18)
      {
        hasValue = true;
      }
      // move to the next player
      index++;
    }
    if (hasValue)
    {
      System.out.println("At least one player is 18 or older: Found.");
    }
    else
    {
      System.out.println("At least one player is 18 or older: Not Found.");
    }
  }
}
