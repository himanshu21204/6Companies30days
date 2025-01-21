package Company_6_Goldman_sachs;

import java.util.Stack;

// https://www.geeksforgeeks.org/problems/number-following-a-pattern3126/1
public class Number_following_A_pattern {
    static String printMinNumberForPattern(String S){
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= S.length(); i++) {
            stack.push(i+1);
            if(i==S.length() || S.charAt(i) == 'I'){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
}
