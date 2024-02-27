public class OverloadedMethods {
    public static void main(String[] args){
        int result1 = add(1,2);
        int  result2 = add(1,2,3);

        System.out.println(result2);
        System.out.println(result1);

    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
}
