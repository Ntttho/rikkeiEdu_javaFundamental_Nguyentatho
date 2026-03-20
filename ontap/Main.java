package ontap;

import java.util.Stack;

public class Main {
    // postfix => infix
    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Giả sử các phần tử cách nhau bởi dấu cách
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) { // Nếu là số
                stack.push(Integer.parseInt(token));
            } else { // Nếu là toán tử
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val1 + val2);
                        break;
                    case "-":
                        stack.push(val1 - val2);
                        break;
                    case "*":
                        stack.push(val1 * val2);
                        break;
                    case "/":
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // infix => postfix
    private static int precedence(String op) {
        if (op.equals("+") || op.equals("-"))
            return 1;
        if (op.equals("*") || op.equals("/"))
            return 2;
        return -1;
    }

    public static String evaluateInfix(String expression) {
        StringBuilder result = new StringBuilder();
        String[] expSplit = expression.trim().split("\\s+"); // Tách theo dấu cách
        Stack<String> stack = new Stack<>();

        for (String token : expSplit) {
            if (token.matches("\\d+")) {
                result.append(token).append(" ");
            }
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }

    public static String convert(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();

        // Split chuẩn hơn để xử lý cả dấu ngoặc dính liền: (1+2) -> ( 1 + 2 )
        String formattedExp = expression.replace("(", " ( ").replace(")", " ) ");
        String[] tokens = formattedExp.trim().split("\\s+");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                result.append(token).append(" ");
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    result.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }

    
    public static void main(String[] args) {
        // String exp = "5 3 + 8 2 * -"; // Tương đương: (5+3) - (8*2) = 8 - 16 = -8
        // System.out.println("Kết quả: " + evaluate(exp));

        String exp2 = "1 + 2 + 3 * 4 / 5 + 6";
        System.out.println("Ket qua: " + evaluateInfix(exp2));

        String exp3 = "(1 + 2 * 3) + 4";
        System.out.println("Ket qua: " + convert(exp3));


        // co them dau ngoac
        // ( 1 + 2 * 3 ) + 4
        // 1 2 3 * + 4 +
        // abcdef
        // stack -> a b c d e f ---rutra---> tempStack = f e d c a b
        // queue -> a b c d e f ---rutra---> tempQueue = a b c d e f

    }
}
