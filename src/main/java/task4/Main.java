package task4;

import task4.ArrayMaxMin;
import task4.IfNoNegative;
import task4.IfNoPositive;
import task4.RangeOfValuesException;

public class Main {

    public static void main(String[] args) {

        ArrayMaxMin maxMin = new ArrayMaxMin();


        int[] array = maxMin.getRandom();

        maxMin.output(array);

        System.out.println();

        int[] min_max = maxMin.searchMaxMin(array);

        int min = min_max[1];
        int max = min_max[0];


        try {
            maxMin.withdraw(min, max);
        } catch (RangeOfValuesException e) {
            e.getComparison();
        } catch (IfNoNegative ifNoNegative) {
            ifNoNegative.getComparison();
        } catch (IfNoPositive ifNoPositive) {
            ifNoPositive.getComparison();
        }


        maxMin.change(array, max, min);

        maxMin.output(array);
    }
}
