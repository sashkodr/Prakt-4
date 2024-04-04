 import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.println("Завдання 1: Складання речення з п'яти окремих слів");
        System.out.println("Введіть п'ять окремих слів:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();
        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        System.out.println("Результат складання речення: " + sentence);

        // Task 2
        System.out.println("\nЗавдання 2: Визначення та виведення на екран першої літери п'яти довільно введених користувачем слів");
        System.out.println("Введіть п'ять слів:");
        String word1Task2 = scanner.next();
        String word2Task2 = scanner.next();
        String word3Task2 = scanner.next();
        String word4Task2 = scanner.next();
        String word5Task2 = scanner.next();
        System.out.println("Перші літери введених слів:");
        System.out.println(word1Task2.substring(0, 1));
        System.out.println(word2Task2.substring(0, 1));
        System.out.println(word3Task2.substring(0, 1));
        System.out.println(word4Task2.substring(0, 1));
        System.out.println(word5Task2.substring(0, 1));

        // Task 3
        System.out.println("\nЗавдання 3: Виведення на екран повідомлення про більше дробове число з трьох введених користувачем");
        System.out.println("Введіть три числа:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Перше число є найбільшим.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Друге число є найбільшим.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Третє число є найбільшим.");
        } else {
            System.out.println("Декілька чисел мають однакове максимальне значення.");
        }

        // Task 4
        System.out.println("\nЗавдання 4: Перевірка ідентичності двох введених з клавіатури імен без урахування регістру");
        System.out.println("Введіть перше ім'я:");
        String name1 = scanner.next().toLowerCase();
        System.out.println("Введіть друге ім'я:");
        String name2 = scanner.next().toLowerCase();
        if (name1.equals(name2)) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }

        // Task 5
        System.out.println("\nЗавдання 5: Визначення більшого за кількістю символів рядка з двох введених користувачем");
        System.out.println("Введіть дві рядки:");
        String str1 = scanner.next();
        String str2 = scanner.next();
        if (str1.length() > str2.length()) {
            System.out.println("Перший рядок містить більше символів.");
        } else if (str1.length() < str2.length()) {
            System.out.println("Другий рядок містить більше символів.");
        } else {
            System.out.println("Рядки містять однакову кількість символів.");
        }
    }
}