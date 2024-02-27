public class StringMethods {
    public static void main( String [] args){
        String name = "Bro";
        String name2 = "bro";
        String cad3 = "";
        String nameWithSpaces = "   Wilmer Flores   ";
        String cad4 = "wal_flo";
        String cad5 =  cad4.replace("_"," ");
        boolean result = name.equals(name2);
        int length = name.length();
        char subString = name.charAt(1);
        boolean empty = cad3.isEmpty();
        String nameWithoudSpaces = nameWithSpaces.trim();
        System.out.println(result);
        System.out.println(subString);
        System.out.println(empty);
        System.out.println(nameWithSpaces);
        System.out.println(nameWithoudSpaces);
        System.out.println(cad5);
    }
}
