package zadanie1;

import java.util.Scanner;

/* если введенное число больше 7, то вывести “Привет” */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }

        scanner.close();
    }
}