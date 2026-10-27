public class StandardArrayAlgorithms
{
  // run the array algorithm
  public static void main(String[] args)
  {
    // set up the permutation
    RandomPermutation perm = new RandomPermutation(5);
    // display the next value
    System.out.println("Next random value in permutation: " + perm.next());
  }
}
