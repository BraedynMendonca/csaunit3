public class Step18ConsecutivePairs
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

  private static class Player
  {
    private String name;
    private int age;

    public Player(String name, int age)
    {
      this.name = name;
      this.age = age;
    }

    // return the player's name
    public String getName()
    {
      return name;
    }

    // return the player's age
    public int getAge()
    {
      return age;
    }
  }
}
