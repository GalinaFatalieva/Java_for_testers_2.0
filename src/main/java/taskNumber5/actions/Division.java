package taskNumber5.actions;

/**
 * Класс деления
 *
 * Сделано исключение деления на ноль уловием if
 */

public class Division extends Action{


    @Override
    public double calculate() {

        if (getActionB() == 0){
            System.err.println("Делить на ноль нельзя");
            System.exit(0);
        }

        return getActionA() / getActionB();
    }

    @Override
    public void input() {

        System.out.printf("Частное %f и %f равно %.4f", getActionA(), getActionB(), calculate());
    }
}
