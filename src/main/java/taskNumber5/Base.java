package taskNumber5;

import taskNumber5.actions.Addition;
import taskNumber5.actions.Division;
import taskNumber5.actions.Multiplication;
import taskNumber5.actions.Subtraction;
import taskNumber5.input.InputAction;

public class Base {
    public static void main(String args[]) {


        InputAction action = new InputAction();

        /**
         * Этот метод определяет желаемое действие пользователя и обращается к соответствующему методу обьекта класса
         * Если введеное значение не совпадает с '+' '-' '*' '/', ввыводиться сообщение об ошибке
         */

        switch (action.inputAction()) {
            case "+":
                Addition add = new Addition();
                add.input();;
                break;
            case "-":
                Subtraction sub = new Subtraction();
                sub.input();
                break;
            case "*":
                Multiplication mul = new Multiplication();
                mul.input();
                break;
            case "/":
                Division div = new Division();
                div.input();
                break;
            default:
                System.err.println("Неверный ввод действия");
        }


    }

}
