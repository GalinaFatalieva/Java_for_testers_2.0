package сalculator1.actions;

/**
 * Класс умножения
 */

public class Multiplication extends Action{


    @Override
    public double calculate() {

        return getActionA() * getActionB();
    }

    @Override
    public void input() {

        System.out.printf("Произведение %f и %f равно %.4f", getActionA(), getActionB(), calculate());
    }
}
