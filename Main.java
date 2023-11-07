package UF5Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input1 = "[0]-=-=*<]:-DOo##=========";
        String input2 = "]-=-*<]:-DOo--*=][=>:o)*=**<]:-DOo0-!...";
        String input3 = "-=-0-o<]:Oo|=--=||++=++=++=>";
        String input4 = "==|<]:-D";

        String santa = "\\*<]:-DOo";
        String ren = ">:o\\)";
        String follet = "<]:-D$";

        int pareNoel1 = contarCoincidencias(input1, santa);
        int ren1 = contarCoincidencias(input1, ren);
        int follet1 = contarCoincidencias(input1, follet);

        int pareNoel2 = contarCoincidencias(input2, santa);
        int ren2 = contarCoincidencias(input2, ren);
        int follet2 = contarCoincidencias(input2, follet);

        int pareNoel3 = contarCoincidencias(input3, santa);
        int ren3 = contarCoincidencias(input3, ren);
        int follet3 = contarCoincidencias(input3, follet);

        int pareNoel4 = contarCoincidencias(input4, santa);
        int ren4 = contarCoincidencias(input4, ren);
        int follet4 = contarCoincidencias(input4, follet);

        System.out.println(formatOutput(pareNoel1, ren1, follet1));
        System.out.println(formatOutput(pareNoel2, ren2, follet2));
        System.out.println(formatOutput(pareNoel3, ren3, follet3));
        System.out.println(formatOutput(pareNoel4, ren4, follet4));
    }

    public static int contarCoincidencias(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
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