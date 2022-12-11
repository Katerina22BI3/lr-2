import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        String date = in.nextLine();
        Pattern slesh = Pattern.compile("[/]");
        Matcher sl = slesh.matcher(date);
        if (date.length() == 10 & sl.find()) {
            String D = date.substring(0, 2);
            String M = date.substring(3, 5);
            String Y = date.substring(6);
            int day = Integer.parseInt(D);
            int month = Integer.parseInt(M);
            int year = Integer.parseInt(Y);
            if (day <= 31 && day > 0 && month > 0 && month < 13 && year >= 1900 && year < 10000) {
                if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
                    if (day <= 31) {
                        System.out.println("Введенное выражение является датой");
                    } else {
                        System.out.println("Введенное выражение НЕ является датой.");
                    }
                }
                if (month == 4 | month == 6 | month == 9 | month == 11) {
                    if (day <= 30) {
                        System.out.println("Введенное выражение является датой");
                    } else {
                        System.out.println("Введенное выражение НЕ является датой.");
                    }
                }
                if (month == 2) {
                    if (day == 29 & year % 4 == 0) {
                        System.out.println("Введенное выражение является датой");
                    } else {
                        if (day <= 28) {
                            System.out.println("Введенное выражение является датой");
                        } else {
                            System.out.println("Ошибка: данный год не високосный.");
                        }
                    }
                }
            }
            else {
                System.out.println("Введенное выражение НЕ является датой.");
            }
            System.out.println(date);
        }
        else {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy.");
        }
    }
}