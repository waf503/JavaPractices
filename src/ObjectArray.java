public class ObjectArray {
    public static void main(String [] args){
        Car c1 = new Car();
        c1.color = "blue";
        c1.model = "R";
        Car  c2 = new Car();
        Car c3 = new Car();

        Car[] cArr = {c1,c2,c3};

        for (Car c : cArr){
            System.out.println(c);
        }
    }
}
