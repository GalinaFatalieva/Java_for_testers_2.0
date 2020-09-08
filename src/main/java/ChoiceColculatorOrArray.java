/* Программа должна выполнять одно из заданий на выбор.
Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiceColculatorOrArray {

    static int inputChoice() {

        int choice = 0;

        try {
            Scanner in = new Scanner(System.in);
            System.out.print(" '1' для запуска калькулятора\n '2' для поиск максимального слова в массиве\nВведите значение:");
            choice = in.nextInt();
        } catch (
                InputMismatchException exc) {
            System.err.println("Вводите числа без дробной части");
            exc.printStackTrace();
            System.exit(0);
        }

        if (choice != 1 && choice != 2) {
            System.err.println("Не верный ввод");
            System.exit(0);
        }
        return choice;
    }

    static void choice(){

        int choice = inputChoice();

        System.out.println();

        if (choice == 1) Calculator.action();
        else TheMaximumWordInArray.longWordSearch ();
    }
}
