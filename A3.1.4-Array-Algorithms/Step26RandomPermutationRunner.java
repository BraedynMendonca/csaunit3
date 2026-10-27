import java.util.NoSuchElementException;
import java.util.Random;

public class Step26RandomPermutationRunner
{
  // run the permutation
  public static void main(String[] args)
  {
    RandomPermutation perm = new RandomPermutation(5);
    // go through each value
    for (int i = 0; i < 5; i++)
    {
      // move to the next value
      System.out.print(perm.next() + " ");
    }
    System.out.println();
  }

  private static class RandomPermutation
  {
    private int[] values;
    private int nextIndex;

    public RandomPermutation(int size)
    {
      // set up the values
      values = new int[size];
      for (int i = 0; i < size; i++)
      {
        values[i] = i;
      }
      Random random = new Random();
      // go through each value and shuffle it
      for (int i = size - 1; i > 0; i--)
      {
        int j = random.nextInt(i + 1);
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
      }
    }

    // return the next value
    public int next()
    {
      if (nextIndex >= values.length)
      {
        throw new NoSuchElementException("No values remain in the permutation.");
      }
      // move to the next value
      return values[nextIndex++];
    }
  }
}
