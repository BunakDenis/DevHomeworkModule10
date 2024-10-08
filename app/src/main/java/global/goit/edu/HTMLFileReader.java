package global.goit.edu;

import java.io.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class HTMLFileReader {

    public static String read(String path) throws IOException {
        StringJoiner result = new StringJoiner("\n");

        File html = new File(path);

        System.out.println(html.exists());

       if (html.exists()) {
            Scanner sc = new Scanner(html);
            StringJoiner content = new StringJoiner("\n");

            while (sc.hasNext()) {
                content.add(sc.nextLine());
            }
           System.out.println("File exist");
           return content.toString();
        }
        return result.toString();
    }
}
