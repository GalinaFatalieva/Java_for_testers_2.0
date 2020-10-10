package taskNumber5.actions;

/**
 * Класс деления
 *
 * Сделано исключение деления на ноль уловием if
 */

public class Division extends Action{

    private double answer;

    public double getAnswer() {
        return answer;
    }

    @Override
    public void calculate(double a, double b) {

        if (b == 0){
            System.err.println("Делить на ноль нельзя");
            System.exit(0);
        }
        answer = a / b;
    }

    @Override
    public void input(double a, double b, double answer) {

        System.out.printf("Частное %f и %f равно %.4f",  a, b, answer);
    }
}
