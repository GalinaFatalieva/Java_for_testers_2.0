package taskNumber4array;

/* Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
Найти максимальный отрицательный и минимальный положительный элементы массива.
Поменять их местами. */


public class ArrayMaxMin {


    /**
     * метод создает и заполняет массив случайными целыми числами от -10 до 10 НЕ включительно.
     * если надо включительно 19 строка: array[i] = (int) (Math.random() * 22 - 11);
     *
     * @return заполненный массив
     */
    public static int[] getRandom() {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 20 - 10);
        }
        return array;
    }

    /**
     * метод выводит массив на консоль. Номер элемента - подним сам элемент.
     */
    public static void output(int[] array) {

// создание массива в массиве и заполнение

        int[][] output = new int[2][array.length];

        for (int i = 0; i < 20; i++) {

            output[0][i] = i;
        }

        for (int i = 0; i < array.length; i++) {

            output[1][i] = array[i];
        }

// вывод

        System.out.println("\nПервая строка номер элемент, вторая - элемент соответственно");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array.length; j++) {

                if (output[i][j] < 10 && output[i][j] >= 0)
                    System.out.print("|  " + output[i][j] + " "); // добавление пробела для однозначных цифр
                else System.out.print("| " + output[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * метод находит максимальный отрицательный и минимальный положительный элементы массива
     *
     * @param array заполненый массив
     */
    public static int[] searchMaxMin(int[] array) {

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] >= 1) {
                if (max <= 0 || max > array[i]) max = array[i];
            } else if (array[i] < 0 && array[i] < min) min = array[i];
        }
        return new int[] {max, min};
    }

    /**
     * Вывод max и min обрабатывая исключения все "0" и если нет отрицательных или положительных значений
     *
     * @param min максимальный отрицательный элемент
     * @param max минимальный положительный элемент
     */
    public static void withdraw(int min, int max) throws RangeOfValuesException, IfNoNegative, IfNoPositive{

        if (min == 0) {
            throw new RangeOfValuesException ();
        } else if (min > 0) {
            throw new IfNoNegative (max);
        } else if (max < 1) {
            throw new IfNoPositive (min);
        } else {
        System.out.println("минимальный положительный элемент = " + max);
        System.out.println("максимальный отрицательный элемент = " + min);
    }
}

    /**
     * метод меняет местами минимальный положительный и максимальный отрицательный элементы
     *
     * @param array заполненный массив
     * @param max   минимальный положительный элемент
     * @param min   максимальный отрицательный элемент
     */
    public static void change(int[] array, int max, int min) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) array[i] = min;
            else if (array[i] == min) array[i] = max;
        }
    }

}
