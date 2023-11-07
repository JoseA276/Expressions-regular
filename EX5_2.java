package UF5Expressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX5_2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("santako.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                int santaCount = countOccurrences(line, "*<]:-DOo");
                int reindeerCount = countOccurrences(line, ">:o)");
                int elfCount = countOccurrences(line, "|<]:-D");

                // Mostrar el resultado de cada línea
                System.out.println(formatOutput(santaCount,reindeerCount,elfCount));
                //"Pare Noel (" + santaCount + ") Ren("+ reindeerCount + ") Follet (" + elfCount + ")"));
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countOccurrences(String text, String pattern) {
        int index = text.indexOf(pattern);
        int count = 0;
        while (index != -1) {
            count++;
            index = text.indexOf(pattern, index + 1);
        }
        return count;
    }
    public static String formatOutput(int pareNoel, int ren, int follet) {
        String output = "";
        if (pareNoel > 0) {
            output += "Pare Noel (" + pareNoel + ")";
        }
        if (ren > 0) {
            if (!output.isEmpty()) {
                output += " ";
            }
            output += "Ren (" + ren + ")";
        }
        if (follet > 0) {
            if (!output.isEmpty()) {
                output += " ";
            }
            output += "Follet (" + follet + ")";
        }
        return output;
    }
}
