import java.util.*;

class Matrix {

    void Addition(int r1, int c1, int r2, int c2, int[][] arr1, int[][] arr2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrix addition not possible. Matrices must have the same dimensions.");
            return;
        }

        System.out.println("The 1st matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The 2nd matrix is: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] arr3 = new int[r1][c1]; // Resultant matrix after addition
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The resultant matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void Multiplication(int r1, int c1, int r2, int c2, int[][] arr1, int[][] arr2) {
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible. Number of columns of first matrix must be equal to number of rows of second matrix.");
            return;
        }

        int[][] arr3 = new int[r1][c2]; // Resultant matrix after multiplication

        System.out.println("The 1st matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The 2nd matrix is: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                arr3[i][j] = 0; // Initialize the result matrix cell
                for (int k = 0; k < c1; k++) { // Perform the multiplication
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("The resultant matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void Transpose(int r1, int c1, int[][] arr1) {
        System.out.println("The given matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transpose = new int[c1][r1]; // New matrix to store the transpose
        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                transpose[j][i] = arr1[i][j];
            }
        }

        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        int r1, c1, i, j, r2, c2, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the 1st matrix: ");
        r1 = sc.nextInt();
        System.out.println("Enter the number of columns of the 1st matrix: ");
        c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter the elements: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows of the 2nd matrix: ");
        r2 = sc.nextInt();
        System.out.println("Enter the number of columns of the 2nd matrix: ");
        c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the elements: ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        while (true) {
            System.out.println("Matrix Operations:\n1. Matrix Addition\n2. Matrix Multiplication\n3. Transpose of a Matrix");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> obj.Addition(r1, c1, r2, c2, arr1, arr2);
                case 2 -> obj.Multiplication(r1, c1, r2, c2, arr1, arr2);
                case 3 -> obj.Transpose(r1, c1, arr1);
                default -> System.out.println("Please enter a value between 1 and 3.");
            }
        }
    }
}