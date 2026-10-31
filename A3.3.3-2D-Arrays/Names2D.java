public class Names2D {
    public static void main(String[] args) {
        String[][] names = {
            {"Ari", "Avery", "Ash", "Aman"},
            {"Brynn", "Bodie", "Bo", "Barrie"},
            {"Cris", "Carter", "Cali", "Ari"}
        };

        System.out.print("Determine if there are duplicate names: ");
        boolean hasDuplicates = false;

        // compare each name with the ones after it
        outer:
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                for (int nextRow = row; nextRow < names.length; nextRow++) {
                    int startCol = (nextRow == row) ? col + 1 : 0;
                    for (int nextCol = startCol; nextCol < names[nextRow].length; nextCol++) {
                        if (names[row][col].equals(names[nextRow][nextCol])) {
                            hasDuplicates = true;
                            break outer;
                        }
                    }
                }
            }
        }
        System.out.println(hasDuplicates);

        System.out.println("\nAccess consecutive pairs of elements in each row:");
        for (String[] row : names) {
            for (int i = 0; i < row.length - 1; i++) {
                System.out.println(row[i] + ", " + row[i + 1]);
            }
        }

        System.out.println("\nReverse the order of the elements in the second column:");
        String temp = names[0][1];
        names[0][1] = names[2][1];
        names[2][1] = temp;
        printGrid(names);

        System.out.println("\nShift the first name in the first row left to the last spot:");
        String firstName = names[0][0];
        for (int col = 0; col < names[0].length - 1; col++) {
            names[0][col] = names[0][col + 1];
        }
        names[0][names[0].length - 1] = firstName;
        printGrid(names);

        System.out.println("\nShift the third name in the first row down to the last row:");
        String topName = names[0][2];
        for (int row = 0; row < names.length - 1; row++) {
            names[row][2] = names[row + 1][2];
        }
        names[names.length - 1][2] = topName;
        printGrid(names);
    }

    public static void printGrid(String[][] grid) {
        for (String[] row : grid) {
            for (String name : row) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}