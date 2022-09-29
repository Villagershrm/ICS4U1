/**
 * Wing Li
 * September 19, 2022
 * Write a program that writes code for an html program in .txt format
 * This code makes a table of powers of 2
 */
import java.io.*;

public class Q2TwoPowerTable {
    public static void main(String[] args) {
        final int GREATEST_POW = 10;

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("twoPowerTable.html"));
            out.write("<html><head>\n");
            out.write("<title>Powers of Two</title>\n");
            out.write("</head>\n");
            out.write("<body>\n");
            out.write("\t<table border cellpadding = 5>\n");
            out.write("\t<tr><th>Exponent</th><th>Value</th></tr>\n");

            for (int i = 0; i <= GREATEST_POW; i++) {
                out.write("\t<tr><td>" + i + "</td><td>" + Math.pow(i, 2) + "</td></tr>\n");
            }

            out.write("\t</table>\n");
            out.write("</body></html>");

            out.close();
        } catch (Exception e) {
            System.out.println("Failed to write.");
        }
    }
}
