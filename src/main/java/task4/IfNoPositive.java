package task4;

public class IfNoPositive extends Exception{

    private int min;

    public IfNoPositive(int min) {
        this.min = min;
    }

    public void getComparison() {
        System.err.println("Положительных цисел нет");
        System.out.println("максимальный отрицательный элемент = " + min);
        System.exit(0);
    }
}
