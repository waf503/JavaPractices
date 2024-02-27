import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburguer");
        food.add("Pupusa");

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
