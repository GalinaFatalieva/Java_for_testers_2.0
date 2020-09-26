package arrayTack4;

public class RangeOfValuesException extends Exception {

    public void getComparison() {
        System.err.println("Ноль не является ни положительным, ни отрицательным");
        System.exit(0);
    }
}
