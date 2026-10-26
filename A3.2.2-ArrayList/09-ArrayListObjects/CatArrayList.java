import java.util.ArrayList;

public class CatArrayList
{
  public static void main(String[] args)
  {
    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("Fluffy"));
    cats.add(new Cat("Freckles"));
    cats.add(new Cat("Boots"));

    for (Cat cat : cats)
    {
      System.out.println(cat.getName());
    }
  }
}
