public class RandomPermutationRunner
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
}
