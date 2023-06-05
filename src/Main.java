import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    //аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    //только из прописных букв, без чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?:\\D|^)([A-Z]{2,6})");

        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}