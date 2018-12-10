package HomeWork1.HomeEx5;

import HomeWork1.HomeEx2.Matrix;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        int[][] matrix = Matrix.create(new int[5][5]);
        Matrix.create(matrix);
        Matrix.revers(matrix);

        File file = new File("reflected_matrix.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 0; j < matrix[0].length; j++) {
                    writer.write(matrix[i][j] + "\t");
                }
                writer.write("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
