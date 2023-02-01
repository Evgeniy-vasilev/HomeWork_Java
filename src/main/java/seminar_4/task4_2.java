//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
package seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task4_2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        // result [6,6,0,1]
        sum(d1, d2);
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> d3 = new ArrayDeque<>();
        int len = Math.min(d1.size(), d2.size());
        int carry = 0;

        while (len > 0) {
            int tmp = d1.pollFirst() + d2.pollFirst() + carry;

            if (tmp > 9) {
                d3.addLast(tmp % 10);
                carry = tmp / 10;
                len--;
            } else {
                d3.addLast(tmp);
                len--;
            }
            if (len == 0 && carry > 0) {
                d3.addLast(carry);
                len--;
            }
        }

        System.out.println(d3);
        return new ArrayDeque<>(d3);
    }
}

