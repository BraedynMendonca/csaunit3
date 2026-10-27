import java.util.ArrayList;

public class Step09ArrayListObjects
{
  // run the ArrayList example
  public static void main(String[] args)
  {
    // create the cat list
    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("Fluffy"));
    cats.add(new Cat("Freckles"));
    cats.add(new Cat("Boots"));

    // go through each cat
    for (Cat cat : cats)
    {
      System.out.println(cat.getName());
    }
  }

  private static class Cat
  {
    private String name;

    public Cat(String name)
    {
      this.name = name;
    }

    public String getName()
    {
      return name;
    }
  }

}
