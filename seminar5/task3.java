package seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: a+(1*3)] - ложь
// Пример 3: [6+(3*3)] - истина

public class task3 {
    public static void main(String[] args) {
        String math1 = "[6+(3*3)]";
        String math2 = "a+(1*3)]";
        System.out.println(is_valid(math1));
        System.out.println(is_valid(math2));
        System.out.println(is_right(math1));
        System.out.println(is_right(math2));
    }

    public static boolean is_valid(String st) {
        Map<Character, Character> math_text = new HashMap<>();
        math_text.put('(',')');
        math_text.put('[', ']');
        Stack <Character> stack = new Stack<>();
        char[] str = st.toCharArray();
        for (char ch : str) {
            if (math_text.containsKey(ch)){
                stack.add(ch);
            }
            for (Map.Entry<Character, Character> entry : math_text.entrySet()){
                if (ch == entry.getValue()){
                    if(!stack.isEmpty() && stack.peek() == entry.getKey()){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
            
         
    }





// Решение второй группы

    public static boolean is_right(String str) {
        Stack <Character> stack1 = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)){
                stack1.add(c);
            }
        

            for (Map.Entry<Character, Character> entry : map.entrySet()){
                if (c == entry.getValue()){
                    if(!stack1.isEmpty() && stack1.peek() == entry.getKey()){
                        stack1.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return stack1.isEmpty();
    }
}