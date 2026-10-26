import java.util.ArrayList;

public class ArrayListTypeError
{
  public static void main(String[] args)
  {
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Teddy");
    // myList.add(1); // This causes an error because an Integer cannot be added to an ArrayList<String>.
    System.out.println(myList);
  }
}
