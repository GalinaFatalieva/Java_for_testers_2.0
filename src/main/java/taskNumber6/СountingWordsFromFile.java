package taskNumber6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * класс 1. Прочитывает слова из файла.
 *       2. Отсортировывает в алфавитном порядке.
 *       3. Посчитывает сколько раз каждое слово встречается в файле.
 *       4. Выводит статистику на консоль
 */

public class СountingWordsFromFile {

    /**
     * Метод
     * 1. вычитывает фаил
     * 2. разбивает строки на слова и добавляет в массив String[] words
     * 3. слова из массива words добавляются как ключи в TreeMap<String, Integer> wordsMap
     * 4. Если слово впервые попадается, проставляется значение 1
     *    Если повторно счетчик прибавляется
     * 5. Так как коллекция Map реаризован классом TreeMap, происходит автоматическая сортировка по ключу
     *
     * @return (TreeMap<String, Integer> wordsMap)  карту, где ключ - слово, значение - счетчик
     */

    public Map redStrings() {

        String s;
        int i = 0;

        Map<String, Integer> wordsMap = new TreeMap<String, Integer>();

        try (BufferedReader br1 = new BufferedReader(new FileReader("src\\main\\java\\taskNumber6\\fileWork.txt"))) {
            while ((s = br1.readLine()) != null) {

                String[] words = s.split("\\s+"); // "\\s+" выявление несколько идущих пробелов подряд

                for (String word : words) {

                    if (wordsMap.containsKey(word)) {
                        wordsMap.put(word, wordsMap.get(word) + 1);
                    } else {
                        wordsMap.put(word, 1);
                    }
                }

                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e);
        }
        return wordsMap;
    }

    /**
     * Метод выводит на экран слова и количество раз
     */

    public void output(){

        Map<String, Integer> strings = redStrings();

        for (Map.Entry<String, Integer> output : strings.entrySet()) {
            System.out.println("Слово: " + output.getKey() + "  Сколько раз = " + output.getValue());
        }
    }
}
