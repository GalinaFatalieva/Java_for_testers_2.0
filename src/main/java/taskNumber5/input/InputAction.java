package сalculator1.input;

import java.util.Scanner;

/**
 * Класс принимает вводимое желаемое действие
 *
 * @return string значения действия
 */

public class InputAction {

    public String inputAction() {

        System.out.println("'+' сложение\n'-' вычетание\n'*' умножение\n'/' деление");
        Scanner in2 = new Scanner (System.in);
        System.out.print("Введите желаемое действие: ");
        String action = in2.nextLine();

        return action;
    }

}
