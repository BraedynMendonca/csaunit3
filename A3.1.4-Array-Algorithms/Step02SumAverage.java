public class Step02SumAverage
{
  // run the array algorithm
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    int sum = 0;
    // add each game to the total
    for (int i = 0; i < goals.length; i++)
    {
      // move to the next game
      sum += goals[i];
    }
    System.out.println("Total sum of goals: " + sum);
    double average = (double) sum / goals.length;
    System.out.println("Average goals per game: " + average);
  }
}
