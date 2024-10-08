package global.goit.edu;


import global.goit.edu.dateTimeService.DateTimeService;
import global.goit.edu.servlets.TimeServlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class Tests {

    public static void main(String[] args) throws IOException {

        String read = HTMLFileReader.read("app/src/main/webapp/index.jsp");
        System.out.println(read);
        System.out.println(System.getProperty("java.home") );

/*        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        ZoneOffset offset = ZonedDateTime.now().getOffset();
        System.out.println(offset);
        String formatDate = dateTime.format(pattern) + " UTC" + offset.toString();

        System.out.println(formatDate);

        try {
            String read = HTMLFileReader
                    .read("D:\\Java\\IDEProjects\\Developer\\DevHomeworkModule10\\app\\src\\main\\webapp\\index.jsp");

            StringBuilder result = new StringBuilder(read);

            result.replace(result.indexOf("[T"), (result.indexOf("e]") + 2), formatDate);

            //System.out.println(result);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
