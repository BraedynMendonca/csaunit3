public class Step16CountAge15Zero
{
  // run the array algorithm
  public static void main(String[] args)
  {
    Player[] players = {
      new Player("Alex", 16),
      new Player("Bobbie", 18),
      new Player("Chris", 17)
    };
    int count15 = 0;
    // check each player and count matches
    for (Player p : players)
    {
      if (p.getAge() == 15)
      {
        // add one for each match
        count15++;
      }
    }
    System.out.println("Number of players who are 15 years old: " + count15);
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
