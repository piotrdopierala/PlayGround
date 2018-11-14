package pl.dopierala.CodeWars;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidBraces {
    public static void main(String[] args) {
        System.out.println(isValid(")"));
    }


    public static boolean isValid(String braces) {
        int round = 0;
        int brack = 0;
        int curly = 0;

        Stack<Character> open = new Stack<>();


        for (char c : braces.toCharArray()) {
            try {
                switch (c) {
                    case '(':
                        open.push('(');
                        round++;
                        break;
                    case ')':
                        if (open.pop() != '(')
                            return false;
                        round--;
                        break;
                    case '[':
                        open.push('[');
                        brack++;
                        break;
                    case ']':
                        if (open.pop() != '[')
                            return false;
                        brack--;
                        break;
                    case '{':
                        open.push('{');
                        curly++;
                        break;
                    case '}':
                        if (open.pop() != '{')
                            return false;
                        curly--;
                }
            } catch (EmptyStackException e){
                return false;
            }
            if(round<0 || brack<0 || curly<0)
                return false;
        }
        if(round!=0 || brack!=0 || curly!=0)
            return false;

        return true;
    }


}
