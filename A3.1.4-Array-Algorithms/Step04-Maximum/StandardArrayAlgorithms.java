public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int max = goals[0];
    for (int i = 1; i < goals.length; i++)
    {
      if (goals[i] > max)
      {
        max = goals[i];
      }
    }
    System.out.println("Maximum goals in a single game: " + max);
  }
}
