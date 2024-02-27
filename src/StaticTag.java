public class StaticTag {
    public static void main(String [] args){
        Friend f1 = new Friend("Wilmer");
        Friend f2 = new Friend("Juan");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
