package seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3_1 {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 33, 6, 7, 8, 15, 23));

        removeEvenValue(list);
        getMin(list);
        getMax(list);
        getAverage(list);
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println(min);
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println(max);
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list) {
        int avg = 0;

        for (int i = 0; i < list.size(); i++) {
            avg += list.get(i) / list.size();
        }

        System.out.println(avg);
        return avg;
    }
}