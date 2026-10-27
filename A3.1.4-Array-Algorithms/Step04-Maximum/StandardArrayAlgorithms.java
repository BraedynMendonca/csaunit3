public class StandardArrayAlgorithms
{
  // run the array algorithm
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int max = goals[0];
    // check each game for the highest score
    for (int i = 1; i < goals.length; i++)
    {
      // move to the next game
      if (goals[i] > max)
      {
        max = goals[i];
      }
    }
    System.out.println("Maximum goals in a single game: " + max);
  }
}
