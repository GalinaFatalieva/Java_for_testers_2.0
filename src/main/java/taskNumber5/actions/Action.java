package сalculator1.actions;

import сalculator1.input.InputA;
import сalculator1.input.InputB;

/**
 * Абстракный класс для классов действий
 */

public abstract class Action {

    InputA aa = new InputA();
    InputB bb = new InputB();


    private double actionA = aa.getA(); //Присваиваем actionA значение, которое первым ввели в консоли
    private double actionB = bb.getB(); //actionB = второе значение из консоли

    public double getActionA() {
        return actionA;
    }

    public double getActionB() {
        return actionB;
    }

    /**
     * Арифметическое действие
     * @return Результат арифметического действия
     */
    public abstract double calculate();

    /**
     *Ввод на экран форматированием
     */
    public abstract void input();

}
