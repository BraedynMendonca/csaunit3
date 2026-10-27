public class Player
{
  // keep the player details
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
