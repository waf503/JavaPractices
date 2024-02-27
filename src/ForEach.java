public class ForEach {
    public static void main(String[] args){
        String[] animals = {"caca","coco"};
        Integer[] number = {1,2,3,4};

        for (Integer item : number){
            System.out.println(item);
        }

        for (String i : animals){
            System.out.println(i);
        }
    }
}
