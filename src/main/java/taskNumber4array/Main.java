package task4;

import taskNumber4array.ArrayMaxMin;
import taskNumber4array.IfNoNegative;
import taskNumber4array.IfNoPositive;
import taskNumber4array.RangeOfValuesException;

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
