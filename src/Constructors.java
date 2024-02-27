public class Constructors {
    public static void main(String [] args){
        Pizza pz = new Pizza("thicc crust","tomato","mozzarella");

        System.out.println("Here are the ingredientes of your pizza: ");
        System.out.println(pz.bread);
        System.out.println(pz.sauce);
        System.out.println(pz.cheese);
    }
}
