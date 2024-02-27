public class Methods {
    public static void main(String[] args){
        hello();
        int result = 0;

        int res = sum(1,2);
        System.out.println(res);
    }
    static void hello(){
        System.out.println("Hello");
    }
    public static int sum(int n1, int n2){
        return n1 + n2;
    }
}

