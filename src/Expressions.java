import java.util.Scanner;

public class Expressions {
    private static int n1;
    private static int n2;

    public static void main(String[] args) {
        /*expressions*/
        System.out.println("Expressions");
        n1 = 20;
        n2 = 10;

        double result = operate('/');

        System.out.println(result);


    }
    public static double operate(char operator){
        double res = 0;
        switch  (operator){
            case '+':
                res = n1 + n2;
            break;
            case '-':
                res = n1 - n2;
            break;
            case '/':
                res = n1 / n2;
            break;
            case '*':
                res = n1 * n2;
            break;
            case '%':
                res = n1 % n2;
            break;
            default:
                res = 0;
        }

        return res;
    }
}
