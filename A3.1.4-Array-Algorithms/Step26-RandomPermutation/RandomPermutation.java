import java.util.NoSuchElementException;
import java.util.Random;

public class RandomPermutation
{
  private int[] values;
  private int nextIndex;

  public RandomPermutation(int size)
  {
    values = new int[size];
    for (int i = 0; i < size; i++)
    {
      values[i] = i;
    }
    Random random = new Random();
    for (int i = size - 1; i > 0; i--)
    {
      int j = random.nextInt(i + 1);
      int temp = values[i];
      values[i] = values[j];
      values[j] = temp;
    }
  }

  public int next()
  {
    if (nextIndex >= values.length)
    {
      throw new NoSuchElementException("No values remain in the permutation.");
    }
    return values[nextIndex++];
  }
}
