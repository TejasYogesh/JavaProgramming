public class strMethods{
    public static void main(String[] args) {
        String str = "Welcome";
        int i = str.length();
        System.out.println(i);
        String str2 = str.toUpperCase();
        String str3 = str.toLowerCase();
        System.out.println(str2);
        System.out.println(str3);
        String str4 = "   welcome   ";
        System.out.println(str4);
        str4 = str4.trim();
        System.out.println(str4);
    }
}