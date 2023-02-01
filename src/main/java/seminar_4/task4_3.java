//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

package seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class task4_3 {
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>(Arrays.asList('(', ')', '[', ']', '{', '}'));
        System.out.println(validate(deque));
    }

    public static boolean validate(Deque<Character> deque) {
        Stack<Character> st = new Stack<>();

        if (deque.size() == 0) {
            return true;
        } else if (deque.size() % 2 == 1) {
            return false;
        }

        for (Character c : deque) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    st.push(c);
                    break;
                case ')':
                    if (st.peek() == '(') {
                        st.pop();
                        break;
                    } else return false;
                case ']':
                    if (st.peek() == '[') {
                        st.pop();
                        break;
                    } else return false;
                case '}':
                    if (st.peek() == '{') {
                        st.pop();
                        break;
                    } else return false;
            }
        }
        return st.isEmpty();
    }
}

