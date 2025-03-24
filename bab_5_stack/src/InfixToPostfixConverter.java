/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
import java.util.Stack;
public class InfixToPostfixConverter {
    
    public static int predence (char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    
    public static String infixToPostfix(String expression){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); ++i){
            char c = expression.charAt(i);
            
            if(c == ' '){
                continue;
            }
            
            if (Character.isDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && predence(c) <= predence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(c);
                    
            } 
                
        }
        
        while (!stack.isEmpty()) {
            if(stack.peek() == '(')
                return "Invalid Expression";
            result.append(stack.pop());   
        }
        return result.toString();
    }
    
    public static int evaluatePostfix(String exp){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);
            
            if (Character.isDigit(c))
                stack.push(c -'0');
            
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
            
        }
        
        return stack.pop();
        
    }
    
    
    public static void main(String[] args) {
       String exp = "3 + 4 * 2 / (1 - 5)";
       String postfix = infixToPostfix(exp);
       System.out.println("Postfix Expression : " + postfix);
       System.out.println("Evaluation Result : " + evaluatePostfix(postfix));
    }
    
}
