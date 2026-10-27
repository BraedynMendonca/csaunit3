public class StandardArrayAlgorithms
{
  // run the array algorithm
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 15),
      new Player("Aiden", 14),
      new Player("Bobbie", 18),
      new Player("Blaine", 20),
      new Player("Chris", 16),
      new Player("Charlie", 17)
    };
    System.out.println("Consecutive Player Pairs:");
    // go through each pair
    for (int i = 0; i < players.length; i += 2)
    {
      // move to the next pair
      System.out.println(players[i].getName() + " and " + players[i + 1].getName());
    }
  }
}
