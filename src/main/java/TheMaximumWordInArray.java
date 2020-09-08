/* Поиск максимального элемента в массиве.
Для начала задать массив слов.
Размерность массива произвольна, задается в консоли.
После чего в консоли вводятся слова в количестве равном заданной длине массива.
В полученном массиве необходимо найти самое длинное слово.
Результат вывести на консоль */

import org.w3c.dom.ls.LSOutput;

import java.util.*;

/**
 * В этом классе реализован массив, который заполняется с консоли.
 * Выводятся самые длинные слова в массиве через &.
 *
 * @authot Fatalieva Falina
 */


public class TheMaximumWordInArray {

    /**
     * Этот метод принимает вводимые значение размера массива с консоли
     *
     * @return размерность массива
     *
     * @exception InputMismatchException генерируется исключение
     * отрицательные вводимые значения обрабатываются условие if
     */
    static int dimensionOfArray (){

        int dimension = 0;

        try {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        dimension = in.nextInt();
        } catch (InputMismatchException exc){
            System.err.println("Вводите числа без дробной части");
            exc.printStackTrace();
            System.exit(0);
        }

        if (dimension < 0 ){
            System.err.println("Размерность массива не может быть отрицательна");
            System.exit(0);
        }

        return dimension;
    }

    /**
     * Этот метод принимает вводимые слова в массив
     *
     * @return массив слов
     */
    static String[] wordInput () {

        int dimension = dimensionOfArray ();

        String[] array = new String[dimension];

        for (int i = 0; i < array.length; i++){

            Scanner in = new Scanner (System.in);
            System.out.print("Введите " + (i+1) + "ое слово: ");
            array [i] = in.nextLine();
        }

        return array;
    }

    /**
     * Метод переводит массив в лист
     */
    static List arrayToList() {

        String[] array = wordInput ();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++){

            list.add(array[i]);
        }

        return list;
    }


    /**
     * Этот метод сравнивает длину значений list и сохраняет максимальное
     * если два слова одинаковой максимальной долины они выводятся через &
     */
    static void longWordSearch () {

        List<String> equal = arrayToList();
        String max = equal.get(0);
        int maxLen = max.length();
        int len = equal.size();

        for (int i = 1; i < len; i++){

            if (maxLen < equal.get(i).length()){
                max = equal.get(i);
                maxLen = equal.get(i).length();
            } else if (maxLen == equal.get(i).length()){
                equal.add(equal.get(i));  // добавляем вконец элемент равный максимальному
            }
        }

        /*
        * перепроверяем элементы, ранее совпадающие с максимальны
        * если они еще совпадают, соединяет строки
        * */
        StringBuilder maxCon = new StringBuilder(max);

        for (int i = len ; i < equal.size(); i++){

            if (maxLen == equal.get(i).length()){
                maxCon.append(" & ");
                maxCon.append(equal.get(i));
            }
        }

       System.out.println("Максимальная длина у слов(а): " + maxCon);
    }

}
