/*
 * Activity 3.1.3
 */
public class Step03CatCollectionRename
{
  // run the array example
  public static void main(String[] args)
  {
    Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};

    // find the cat to rename
    for (Cat c : cats)
    {
      if (c.getName().equals("Boots"))
        c.setName("Kitty");
    }

    // display each cat
    for (Cat c : cats)
    {
      System.out.println(c);
    }
  }

  private static class Cat
  {
    private String name;
    private int age;

    public Cat(String initName)
    {
      name = initName;
    }

    public String getName()
    {
      return name;
    }

    public void setName(String newName)
    {
      name = newName;
    }

    public void setAge(int newAge)
    {
      age = newAge;
    }

    public String toString()
    {
      return name;
    }
  }

}
