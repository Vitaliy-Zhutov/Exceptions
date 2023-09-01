package homework_2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        String input = userInput();
        System.out.println("Вы ввели: " + input);
    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст, кроме пустой строки -> ");
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                return input;

            } catch (Exception e) {
                System.out.print("Пустые строки вводить нельзя, повторите -> ");
            }
        }
    }
}
