public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 15),
      new Player("Aiden", 14),
      new Player("Bobbie", 18),
      new Player("Blaine", 20)
    };
    System.out.println("Consecutive Player Pairs:");
    for (int i = 0; i < players.length - 1; i++)
    {
      System.out.println(players[i].getName() + " and " + players[i + 1].getName());
    }
  }
}
