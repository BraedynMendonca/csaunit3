public class Step05Minimum
{
  // run the array algorithm
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int min = goals[0];
    // check each game for the lowest score
    for (int i = 1; i < goals.length; i++)
    {
      // move to the next game
      if (goals[i] < min)
      {
        min = goals[i];
      }
    }
    System.out.println("Minimum goals in a single game: " + min);
  }
}
