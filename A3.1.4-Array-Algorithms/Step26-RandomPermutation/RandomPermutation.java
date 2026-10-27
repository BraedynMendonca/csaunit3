import java.util.NoSuchElementException;
import java.util.Random;

public class RandomPermutation
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
