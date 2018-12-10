package HomeWork1.HomeEx5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    private int[][] matrix;
    File file = new File("Tets.txt");

    public Test() throws IOException {
        file.createNewFile();
        matrix = new int[5][5];
        createArray();
    }

    private void createArray() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20) - 10;
            }
        }
    }

    private void writeFile() throws IOException {
        createArray();
        try (FileWriter fileWriter = new FileWriter("Main.txt")) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++)
                    fileWriter.write(matrix[i][j]);
                fileWriter.flush();
            }
        }
    }

    public void ReadFile() throws FileNotFoundException, IOException {

        Scanner scannerfile = new Scanner(file);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (scannerfile.hasNextInt())
                    matrix[i][j] = scannerfile.nextInt();
            }
        }

        System.out.print("Введенный массив\n");
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        Test test = new Test();
        test.writeFile();
    }
}
