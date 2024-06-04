import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("90, 180, 270");
        int degree = sc.nextInt();

        System.out.println("Оригинальная матрица");
        int[][] matrix = fillMatrix(SIZE);
        printMatrix(matrix);

        System.out.println("Перевернутая матрица на " + degree + " градусов по часовой");
        int[][] rotatedMatrix = rotateMatrix(matrix, degree);
        printMatrix(rotatedMatrix);

    }

    public static int[][] fillMatrix(int SIZE) {
        Random rand = new Random();
        int[][] matrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = rand.nextInt(256);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix, int degree) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        switch (degree) {
            case 90:
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        rotatedMatrix[i][j] = matrix[matrix.length - j - 1][i];
                    }
                }
                break;
            case 180:
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        rotatedMatrix[i][j] = matrix[matrix.length - j - 1][matrix.length - i - 1];
                    }
                }
                break;
            case 270:
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        rotatedMatrix[i][j] = matrix[j][matrix.length - i - 1];
                    }
                }
                break;
            default:
                return rotatedMatrix = matrix;

        }
        return rotatedMatrix;
    }
}