public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 15),
      new Player("Bobbie", 18),
      new Player("Chris", 16)
    };
    boolean allHaveValue = true;
    for (Player p : players)
    {
      if (p.getAge() >= 21)
      {
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
