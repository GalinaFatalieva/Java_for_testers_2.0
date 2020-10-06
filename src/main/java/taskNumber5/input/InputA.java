package taskNumber5.input;

/**
 * Класс первого числа, которое передается с консоли
 */

public class InputA implements InputNum {

    private double a;

    public double getA() {
        System.out.print("Введите 1ое число: ");
        this.a = inputNum();
        return a;
    }
}
