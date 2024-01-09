package zadanie2;

import java.util.Scanner;

/* если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
   если нет, то вывести "Нет такого имени" */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");

        String name = scanner.nextLine();

        if ("Вячеслав".equals(name)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        scanner.close();
    }
}