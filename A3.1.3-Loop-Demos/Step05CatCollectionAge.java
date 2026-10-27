public class Step05CatCollectionAge
{
  // run the array example
  public static void main(String[] args)
  {
    Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};
    // set the age for each cat
    for (Cat c : cats) {
      c.setAge(2);
    }
    // display each cat
    for (Cat c : cats) {
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
