public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 15),
      new Player("Bobbie", 18),
      new Player("Chris", 15)
    };
    int count15 = 0;
    for (Player p : players)
    {
      if (p.getAge() == 15)
      {
        count15++;
      }
    }
    System.out.println("Number of players who are 15 years old: " + count15);
  }
}
