import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = in.nextLine();
        String pattern1 = "[a-z]+";
        Pattern s1 = Pattern.compile(pattern1);
        Matcher needSynb1 = s1.matcher(password);
        String pattern2 = "[A-Z]+";
        Pattern s2 = Pattern.compile(pattern2);
        Matcher needSynb2 = s2.matcher(password);
        String pattern3 = "[_]";
        Pattern s3 = Pattern.compile(pattern3);
        Matcher needSynb3 = s3.matcher(password);
        String pattern4 = "[0-9]+";
        Pattern s4 = Pattern.compile(pattern4);
        Matcher needSynb4 = s4.matcher(password);
        if (password.length()>=8 && needSynb1.find() && needSynb2.find() && needSynb4.find()) {
            System.out.println("Пароль надёжен");
        }
        else {
            System.out.println("Пароль ненадёжен. Повторите ввод");
        }
    }
}