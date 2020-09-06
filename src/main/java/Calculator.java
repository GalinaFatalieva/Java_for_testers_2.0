import java.util.InputMismatchException;
import java.util.Scanner;

/* 1. Начинаем писать калькулятор:

Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
Использовать комментарии и JavaDoc при описании метода.
Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.

2. Запушить проект в свой репозиторий на GitHub

*Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение) */

/**
 * В этом классе реализован калькулятор на сложение, вычитание, умножение и деление двух чисел.
 * Ввод чисел через консоль.
 * Осуществляется проверка на вводимые числа.
 *
 * @authot Fatalieva Falina
*/

public class Calculator {

    public static double a, b;

    /**
     * Этот метод принимает вводимые значения чисел с консоли
     * Сохраняет в типе double
     *
     * @return массив вводимых чисел
     * @exception InputMismatchException генерируется исключение
     */

    static double[] inputNum() {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите 1ое число: ");
            a = in.nextDouble();
            System.out.print("Введите 2ое число: ");
            b = in.nextDouble();
        } catch(InputMismatchException exc) {
            System.err.println("Вводите числа, для разделения целой и дробной части используйте запятую");
            System.exit(0);
        }
        return new double [] {a, b};
    }

    /**
     * Этот метод принимает вводимое значение действия + - * /
     * Сохраняет в string
     *
     * @return string значения действия
     */

    static String inputAction(){

        System.out.println("'+' сложение\n'-' вычетание\n'*' умножение\n'/' деление");
        Scanner in2 = new Scanner (System.in);
        System.out.print("Введите желаемое действие: ");
        String action = in2.nextLine();

        return action;
    }

    /**
     * Этот метод определяет желаемое действие пользователя и обращается к соответствующему методу
     * Если введеное значение не совпадает с '+' '-' '*' '/', ввыводиться сообщение об ошибке
     *
     * @see #inputAction() используется для определения желаемого действия
     * @see #addition() если +
     * @see #subtraction() если -
     * @see #multiplication() если *
     * @see #division() если /
     */
    static void action(){

        String act = inputAction();

        switch (act){
            case "+":
                addition();
                break;
            case "-":
                subtraction();
                break;
            case "*":
                multiplication();
                break;
            case "/":
                division();
                break;
            default:
                System.err.println("Неверный ввод действия");
        }
    }

    /**
     * Этот метод сложения
     * Ввывод значения
     */
    static void addition(){

        double [] num = inputNum();

        double res = num[0] + num[1];

        System.out.printf("Сумма %f и %f равна %.4f", num[0], num[1], res);
    }

    /**
     * Этот метод вычетания
     * Ввывод значения
     */
    static void subtraction(){

        double [] num = inputNum();

        double res = num[0] - num[1];

        System.out.printf("Разность %f и %f равна %.4f", num[0], num[1], res);
    }

    /**
     * Этот метод умножения
     * Ввывод значения
     */
    static void multiplication(){

        double [] num = inputNum();

        double res = num[0] * num[1];

        System.out.printf("Произведение %f и %f равно %.4f", num[0], num[1], res);
    }

    /**
     * Этот метод деления
     * Ввывод значения
     */
    static void division(){

        double [] num = inputNum();

        double res = num[0] / num[1];

        System.out.printf("Частное %f и %f равно %.4f", num[0], num[1], res);
    }

}
