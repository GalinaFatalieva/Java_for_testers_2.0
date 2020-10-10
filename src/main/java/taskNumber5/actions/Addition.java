package taskNumber5.actions;

/**
 * Класс сложения
 */

public class Addition extends Action{


    public double getAnswer() {
        return answer;
    }

    private double answer;

    @Override
    public void calculate(double a, double b) {

        answer = a + b;
    }

    @Override
    public void input(double a, double b, double answer) {

        System.out.printf("Сумма %f и %f равна %.4f", a, b, answer);
    }
}
