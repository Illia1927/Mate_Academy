package HomeWork1.HomeEx2;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = Matrix.create(new int[2][2]);
        Matrix.show(matrix);
        System.out.println();

        Matrix.revers(matrix);

        Matrix.show(matrix);
    }

    public static int[][] create(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20) - 10;
            }
        }
        return matrix;
    }

    public static int[][] revers(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; ++i) {
            int tmp[] = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = tmp;
        }
        return matrix;
    }

    public static void show(int[][] matrixToPrint) {
        for (int i = 0; i < matrixToPrint.length; i++) {
            for (int j = 0; j < matrixToPrint.length; j++) {
                System.out.print(matrixToPrint[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
