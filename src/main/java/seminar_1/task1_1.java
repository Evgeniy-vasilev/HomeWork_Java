/**
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(),
 * который возвращает значение в промежутке [0, 300].
 */

package seminar_1;

public class task1_1 {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 300;
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i] / array.length;
        }
        System.out.println("макс значение = " + max);
        System.out.println("мин значение = " + min);
        System.out.println("среднее значение = " + avg);
    }
}
