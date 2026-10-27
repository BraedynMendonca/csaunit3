import java.util.Arrays;

public class Step19_20RotateLeft
{
  // run the array algorithm
  public static void main(String[] args)
  {
    int[] arr = {10, 20, 30, 40, 50, 60};
    // move each value one spot left
    for (int i = 0; i < arr.length - 1; i++)
    {
      // move to the next value
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
