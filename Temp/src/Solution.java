import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        LocalDate actual = LocalDate.of(year, month, day);

        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();
        LocalDate expected = LocalDate.of(year, month, day);

        if(actual.isBefore(expected) || actual.isEqual(expected)){
            System.out.println(0);
        }
        else if(actual.isAfter(expected)
                && actual.getMonth() == expected.getMonth()
                && actual.getYear() == expected.getYear()){
            ChronoUnit.DAYS.between(actual, expected);
            //System.out.println((15*price));
        }
    }
}