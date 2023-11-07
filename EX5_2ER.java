package UF5Expressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX5_2ER {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("santako.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                int santaCount = countMatches(line, "\\*<]:-DOo");
                int reindeerCount = countMatches(line, ">:o\\)");
                int elfCount = countMatches(line, "<]:-D");

                System.out.println(formatOutput(santaCount,reindeerCount,elfCount));
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countMatches(String text, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        int count = 0;
        while (m.find()) {
            count++;
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
