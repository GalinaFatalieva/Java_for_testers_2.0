package taskNumber5;

import taskNumber5.actions.Addition;
import taskNumber5.actions.Division;
import taskNumber5.actions.Multiplication;
import taskNumber5.actions.Subtraction;
import taskNumber5.input.InputA;
import taskNumber5.input.InputAction;
import taskNumber5.input.InputB;

public class Base {
    public static void main(String args[]) {


        InputAction action = new InputAction();

        InputA inputA = new InputA();
        InputB inputB = new InputB();

        /**
         * Этот метод определяет желаемое действие пользователя и обращается к соответствующему методу обьекта класса
         * Если введеное значение не совпадает с '+' '-' '*' '/', ввыводиться сообщение об ошибке
         */

        switch (action.inputAction()) {



            case "+":
                Addition add = new Addition();
                double a = inputA.getA();
                double b = inputB.getB();
                add.calculate(a, b);
                add.input(a, b, add.getAnswer());
                break;
            case "-":
                Subtraction sub = new Subtraction();
                double a2 = inputA.getA();
                double b2 = inputB.getB();
                sub.calculate(a2, b2);
                sub.input(a2, b2, sub.getAnswer());
                break;
            case "*":
                Multiplication mul = new Multiplication();
                double a3 = inputA.getA();
                double b3 = inputB.getB();
                mul.calculate(a3, b3);
                mul.input(a3, b3, mul.getAnswer());
                break;
            case "/":
                Division div = new Division();
                double a4 = inputA.getA();
                double b4 = inputB.getB();
                div.calculate(a4, b4);
                div.input(a4, b4, div.getAnswer());
                break;
            default:
                System.err.println("Неверный ввод действия");
        }


    }

}
