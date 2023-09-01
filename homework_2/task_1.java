package homework_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Float num = UserFloatNumber();
        System.out.println("Ваше число: " + num);
    }

    public static Float UserFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число (разделитель точка) -> ");
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
                
            } catch (NumberFormatException e) {
                System.out.print("Некорректно введеное число, повторите ввод -> ");
            }
        }
    }
}
