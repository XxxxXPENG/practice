package JzOffer.String;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class IsValid {
    //使用stack数据结构，遇到左括号入栈,右括号栈顶出
    public static boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '('){
                stack.push(')');
            }else if(c =='['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()()]}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("[}{"));
    }
}
