package codingTestPractice.datastructure.stack;

import java.util.Stack;

public class Sol {
    //괄호 문제
    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==')'||c=='}'||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(((c==')')&&top!='(') || ((c=='}')&&top!='{') || ((c==']')&&top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //계산기 구현
    public static double calculate(String str){
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int len = str.length();
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                double num = ch - '0';
                while(i+1<len && Character.isDigit(str.charAt(i+1))){
                    num = num * 10 + (str.charAt(i + 1) - '0');
                    i++;
                }
                numbers.push(num);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch ==')'){
                while(operators.peek()!='('){
                    double result = applyOperation(operators.pop(), numbers.pop(), numbers.pop());
                    numbers.push(result);
                }
                operators.pop();
            }else if(ch == '+'|| ch == '-' || ch=='*' || ch=='/'){
                while(!operators.isEmpty() && hasPrecedence(ch, operators.peek())){
                    double result = applyOperation(operators.pop(), numbers.pop(), numbers.pop());
                    numbers.push(result);
                }
                operators.push(ch);
            }
            while(!operators.isEmpty()){
                double result = applyOperation(operators.pop(), numbers.pop(), numbers.pop());
                numbers.push(result);
            }
        }
        return numbers.pop();
    }

    public static double applyOperation(char operator, double b, double a){
        switch(operator){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b==0){
                    throw new UnsupportedOperationException("Cannot divide by zero.");
                }
                return a / b;
        }
        return 0;
    }

    public static boolean hasPrecedence(char op1, char op2){
        if(op2 == '(' || op2 == ')'){
            return false;
        }
        if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 =='-') ){
            return false;
        }
        return true;
    }



    public static void main(String[] args) {
        String s1 = "([])(){}";
        String s2 = "([)]";
        String s3 = "([](){([])})";
        String s4 = "";

        System.out.println(s1 + " is balanced? " + isBalanced(s1));
        System.out.println(s2 + " is balanced? " + isBalanced(s2));
        System.out.println(s3 + " is balanced? " + isBalanced(s3));
        System.out.println(s4 + " is balanced? " + isBalanced(s4));
    }
}
