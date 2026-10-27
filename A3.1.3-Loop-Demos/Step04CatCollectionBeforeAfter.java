public class Step04CatCollectionBeforeAfter
{
  // run the array example
  public static void main(String[] args)
  {
    Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};
    // find Boots and show the change
    for (Cat c : cats) {
      if (c.getName().equals("Boots")) {
        System.out.println(c);
        c.setName("Kitty");
        System.out.println(c);
      }
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
