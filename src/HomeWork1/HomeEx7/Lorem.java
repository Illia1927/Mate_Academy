package HomeWork1.HomeEx7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lorem {
    public static void main(String[] args) {
        File inFile = new File("E:/Programming/MateHomeWork/src/HomeWork1.HomeEx7/input.txt");
        File outFile = new File("E:/Programming/MateHomeWork/src/HomeWork1.HomeEx7/filtered_lorem.txt");

        String inText = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)))) {

            while (reader.ready()) {
                inText += reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        inText = inText.replaceAll("[^a-zA-Z]", " ");
        String[] words = inText.split(" ");


        try (FileWriter stream = new FileWriter(outFile)) {

            for (String word : words) {
                if (word.length() > 3)
                    stream.write(word + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
