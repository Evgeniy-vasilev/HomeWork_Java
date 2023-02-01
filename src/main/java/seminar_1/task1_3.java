/**
 * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
 * используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */

package seminar_1;

public class task1_3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean simple = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.println(i);
            }
        }
    }
}
