package сalculator1.input;

/**
 *Класс второго числа, которое передается с консоли
 */

public class InputB implements InputNum {

    private double b;

    public double getB() {
        System.out.print("Введите 2ое число: ");
        this.b = inputNum();
        return b;
    }

}
