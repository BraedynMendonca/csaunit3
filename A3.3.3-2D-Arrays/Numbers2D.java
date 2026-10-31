public class Numbers2D {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 5, 3, 8, -3, 0, 3},
            {4, 4, 8, 0, 3, -1, 1},
            {0, 3, 8, 4, -2, 7, 6}
        };

        int sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int negativeCount = 0;

        // go through each value in every row
        for (int[] row : numbers) {
            for (int value : row) {
                sum += value;
                count++;

                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
                if (value < 0) {
                    negativeCount++;
                }
            }
        }

        double average = (double) sum / count;
        System.out.println("The sum is " + sum
                + ", the average is approximately " + average
                + ", the minimum value is " + min
                + ", the maximum value is " + max
                + ", and the number of negative values is " + negativeCount + ".");
    }
}