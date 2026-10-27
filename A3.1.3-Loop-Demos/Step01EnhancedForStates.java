/*
 * Activity 3.1.3
 */
public class Step01EnhancedForStates
{
  // run the array example
  public static void main(String[] args)
  {
    String[] newEngland = {"Maine", "New Hampshire",
                           "Vermont", "Massachusetts",
                           "Connecticut", "Rhode Island"};

    System.out.println("The New England States:");
    // go through each state
    for (String state : newEngland)
    {
      System.out.println(state);
    }
  }
}
