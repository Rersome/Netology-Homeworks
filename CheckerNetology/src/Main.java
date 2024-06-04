import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordChecker checker = new PasswordChecker();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите минимальную длину пароля: ");
        int minLength = sc.nextInt();
        checker.setMinLength(minLength);

        System.out.print("Введите максимальное количество повторений символа подряд: ");
        int maxRepeats = sc.nextInt();
        checker.setMaxRepeats(maxRepeats);

        while (true) {
            System.out.print("Введите пароль или end: ");
            String password = sc.next();

            if (password.equals("end")) {
                break;
            }
            System.out.println(checker.verify(password) ? "Подходит!" : "Не подходит!");
        }
    }
}