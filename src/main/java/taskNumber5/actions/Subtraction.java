package taskNumber5.actions;

/**
 * Класс вычитания
 */

public class Subtraction extends Action {

    private double answer;

    public double getAnswer() {
        return answer;
    }

    @Override
    public void calculate(double a, double b) {

        answer = a - b;
    }

    @Override
    public void input(double a, double b, double answer) {

        System.out.printf("Разность %f и %f равна %.4f",  a, b, answer);

    }
}
