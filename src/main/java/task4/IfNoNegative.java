package task4;

public class IfNoNegative extends Exception{

    private int max;

    public IfNoNegative(int max) {
        this.max = max;
    }

    public void getComparison() {
        System.out.println("минимальный положительный элемент = " + max);
        System.err.println("Отрицательных цисел нет");
        System.exit(0);
    }
}
