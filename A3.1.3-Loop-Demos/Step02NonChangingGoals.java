/*
 * Activity 3.1.3
 */
public class Step02NonChangingGoals
{
  // run the array example
  public static void main(String[] args)
  {
    int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};

    // start a new season!
    // go through each goal
    for (int g : goals)
    {
      g = 0;
    }

    // display each goal
    for (int g : goals)
    {
      System.out.print(g + " ");
    }
  }
}
