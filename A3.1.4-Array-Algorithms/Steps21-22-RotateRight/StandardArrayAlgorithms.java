import java.util.Arrays;

public class StandardArrayAlgorithms
{
  // run the array algorithm
  public static void main(String[] args)
  {
    int[] arr = {10, 20, 30, 40, 50, 60};
    // move each value one spot right
    for (int i = arr.length - 1; i > 0; i--)
    {
      // move to the previous value
      int temp = arr[i - 1];
      arr[i - 1] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
