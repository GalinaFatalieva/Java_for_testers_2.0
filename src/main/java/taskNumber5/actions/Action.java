package taskNumber5.actions;

import taskNumber5.input.InputA;
import taskNumber5.input.InputB;

/**
 * Абстракный класс для классов действий
 */

public abstract class Action {

//    InputA aa = new InputA();
//    InputB bb = new InputB();
//
//
//    private double actionA = aa.getA(); //Присваиваем actionA значение, которое первым ввели в консоли
//    private double actionB = bb.getB(); //actionB = второе значение из консоли
//
//    public double getActionA() {
//        return actionA;
//    }
//
//    public double getActionB() {
//        return actionB;
//    }

    private double answer;

    /**
     * Арифметическое действие
     * @return Результат арифметического действия
     */
    public abstract void calculate(double a, double b);

    /**
     *Ввод на экран форматированием
     */
    public abstract void input(double a, double b, double answer);

}
