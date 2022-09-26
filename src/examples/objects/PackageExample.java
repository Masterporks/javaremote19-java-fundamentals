package examples.objects;

import java.time.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Random;


/** Package- Examples
 *
 * @author Joosep Korela
 */

public class PackageExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());

        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        LocalDateTime localDatetime = LocalDateTime.now();
        LocalDate myBirthday = LocalDate.of(1989,01, 14);
        System.out.println(myBirthday);

        LocalTime localTime = LocalTime.MIDNIGHT;
        System.out.println(localTime);
        
    }
}
