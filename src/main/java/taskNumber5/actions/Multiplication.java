package taskNumber5.actions;

/**
 * Класс умножения
 */

public class Multiplication extends Action{

    private double answer;

    public double getAnswer() {
        return answer;
    }

    @Override
    public void calculate(double a, double b) {

        answer = a * b;
    }

    @Override
    public void input(double a, double b, double answer) {

        System.out.printf("Произведение %f и %f равно %.4f",  a, b, answer);
    }
}
