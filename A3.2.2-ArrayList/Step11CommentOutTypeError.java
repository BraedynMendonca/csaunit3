import java.util.ArrayList;

public class Step11CommentOutTypeError
{
  // run the ArrayList example
  public static void main(String[] args)
  {
    // create a list for text
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Teddy");
    // myList.add(1); // This causes an error because an Integer cannot be added to an ArrayList<String>.
    // display the list
    System.out.println(myList);
  }
}
