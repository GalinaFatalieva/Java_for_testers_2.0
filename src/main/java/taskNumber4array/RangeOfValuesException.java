package taskNumber4array;

public class RangeOfValuesException extends Exception {

    public void getComparison() {
        System.err.println("Ноль не является ни положительным, ни отрицательным");
        System.exit(0);
    }
}
