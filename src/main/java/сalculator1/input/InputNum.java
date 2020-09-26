package сalculator1.input;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Интерфейс для реализации классов, которые будут принимать числа с консоли
 */

public interface InputNum {

    /**
     *Метод принимает вод с консоли и переводит в число с плавающей запятой
     *
     * @return число с консоли
     * @exception InputMismatchException генерируется исключение
     */
    default double inputNum() {

        double x = 0;

        try {
            Scanner in = new Scanner(System.in);
            x = in.nextDouble();
        } catch (InputMismatchException exc) {
            System.err.println("Вводите числа, для разделения целой и дробной части используйте запятую\n");
            System.exit(0);
        }
        return x;
    }
}
