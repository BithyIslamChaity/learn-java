package TwentyOneClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class PlainTextFile {
    public static void main(String[] args) {

                String filePath = "C:\\Users\\Java Student PC-3\\Desktop\\plain.text"; // Ensure the file exists

                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    // Read the file line by line
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                }
            }
        }
