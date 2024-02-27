import java.util.Random;

public class MathClass {
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;

        double z = Math.min(x, y);
        double ab = Math.abs(y);
        double round = Math.round(x);
        double ceil = Math.ceil(x);
        double floor = Math.floor(x);

        Random random = new Random();
        int r1 = random.nextInt(2);

        System.out.println(z);
        System.out.println("The abc is: "+ ab);
        System.out.println("The round value is : "+ round);
        System.out.println("The ceil : "+ ceil);
        System.out.println("The floor : "+ floor);
        System.out.println("Este es un número random : "+ r1);
    }
}
