package сalculator1.actions;

/**
 * Класс вычитания
 */

public class Subtraction extends Action {


    @Override
    public double calculate() {

        return getActionA() - getActionB();
    }

    @Override
    public void input() {

        System.out.printf("Разность %f и %f равна %.4f", getActionA(), getActionB(), calculate());

    }
}
