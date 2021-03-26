package com.wxianfeng.open.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author haomiao.wxf
 * @date 2021/01/24 4:04 PM
 *
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class BracketIsValid {
    public static void main(String[] args) {
        // false
        System.out.println(isValid("["));
        // true
        System.out.println(isValid("[{}()]"));
        // false
        System.out.println(isValid("(){}}{"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 > 0) {
            return false;
        }

        // 注意不要用双引号，双引号是字符串，单引号是 char
        Map<Character, Character> map = new HashMap() {
            {
                put('[', ']');
                put('(', ')');
                put('{', '}');
            }
        };

        Stack<Character> stack = new Stack();
        // System.out.println(stack);
        char[] chars = s.toCharArray();
        // System.out.println(chars);
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() == '}' || stack.peek() == ']' || stack.peek() == ')') {
                    return false;
                }
            }

            // System.out.println(stack);
            char thisChar = chars[i];
            // System.out.println(thisChar);
            // System.out.println(map);
            // System.out.println(map.get(thisChar));
            if (!stack.isEmpty() && thisChar == map.get(stack.peek())) {
                // System.out.println("here");
                stack.pop();
            } else {
                stack.push(thisChar);
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
