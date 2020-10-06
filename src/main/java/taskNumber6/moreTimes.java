package taskNumber6;

import java.util.*;

/**
 * Класс 1. Находит слово с максимальным количеством повторений.
 *       2. Выводит на консоль это слово и сколько раз оно встречается в файле
 */

public class moreTimes {

    /**
     * Метод находит максимальное колличесво повторений
     * @param wordsMap карта, где ключ - слово, значение - счетчик
     * @return max - максимальное колличесво повторений
     */

    public int maximumRepeat(Map<String, Integer> wordsMap){

        Iterator<Map.Entry<String, Integer>> inter = wordsMap.entrySet().iterator();

        Integer max = 0;

        while (inter.hasNext()){

            Map.Entry<String, Integer> map = inter.next();

             if (map.getValue() > max)  max = map.getValue();
        }
        return max;
    }

    /**
     * Метод находит в wordsMap ключ по значению и выводит на консоль
     * @param wordsMap карта, где ключ - слово, значение - счетчик
     * @param max - максимальное колличесво повторений
     */

    public void maximumOutput(Map<String, Integer> wordsMap, Integer max){

        Iterator<Map.Entry<String, Integer>> inter = wordsMap.entrySet().iterator();


        while (inter.hasNext()){

            Map.Entry<String, Integer> map = inter.next();

            if (map.getValue() == max) System.out.println("Максимальное число повторов = " + max + "  у слова: " + map.getKey());;
        }
    }
}
