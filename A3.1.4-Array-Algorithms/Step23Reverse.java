import java.util.Arrays;

public class Step23Reverse
{
  // run the array algorithm
  public static void main(String[] args)
  {
    int[] arr = {1, 2, 3, 4, 5, 6};
    // swap values from each end
    for (int i = 0; i < arr.length / 2; i++)
    {
      // move toward the middle
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
