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

    // Menentukan prioritas operator
    public static int precedence(char ch) {
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

    // Mengonversi ekspresi infix ke postfix
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            // Abaikan spasi
            if (c == ' ') {
                continue;
            }

            // Jika karakter adalah digit, tambahkan ke hasil
            if (Character.isDigit(c)) {
                result.append(c);
            } 
            // Jika karakter adalah tanda kurung buka
            else if (c == '(') {
                stack.push(c);
            } 
            // Jika karakter adalah tanda kurung tutup
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Menghapus '('
            } 
            // Jika karakter adalah operator
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Mengeluarkan semua operator yang tersisa di stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Mengevaluasi ekspresi postfix
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // Jika karakter adalah digit, push ke stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } 
            // Jika karakter adalah operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        // Mengembalikan hasil evaluasi
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "3 + 4 * 2 / (1 - 5)";
        String postfix = infixToPostfix(exp);
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Evaluation Result: " + evaluatePostfix(postfix));
    }
}
