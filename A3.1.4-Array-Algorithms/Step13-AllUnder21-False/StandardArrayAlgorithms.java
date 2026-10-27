public class StandardArrayAlgorithms
{
  // run the array algorithm
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 15),
      new Player("Bobbie", 22),
      new Player("Chris", 16)
    };
    boolean allHaveValue = true;
    // check each player for the age limit
    for (Player p : players)
    {
      if (p.getAge() >= 21)
      {
        // mark that not all players match
        allHaveValue = false;
      }
    }
    if (allHaveValue)
    {
      System.out.println("All players are under 21: True.");
    }
    else
    {
      System.out.println("All players are under 21: False.");
    }
  }
}
