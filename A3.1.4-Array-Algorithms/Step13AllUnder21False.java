public class Step13AllUnder21False
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
