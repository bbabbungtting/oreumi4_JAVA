package weeklyquiz.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MatchPair {
    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(match(input));
    }

    static boolean match(String input) {
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}