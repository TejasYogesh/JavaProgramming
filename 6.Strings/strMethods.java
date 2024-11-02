public class strMethods{
    public static void main(String[] args) {
        String str = "Welcome";


        // the length of the string in the code.
        int i = str.length();
        System.out.println(i);

        // the function of the uppercase and the lowercase in the code
        String str2 = str.toUpperCase();
        String str3 = str.toLowerCase();
        System.out.println(str2);
        System.out.println(str3);

        // The function of the trim () function in the code.
        String str4 = "   welcome   ";
        System.out.println(str4);
        str4 = str4.trim();
        System.out.println(str4);


        // the function of the substring in the code = with the begin Index only.
        String str5 = str.substring(2);
        System.out.println(str5);


        // the function of the substring in the code = with the begin index and the and the ending index.
        String str6 = str.substring(2,5);
        System.out.println(str6);

        // the function of the substring replacement in the code.
        String str7 = str.replace('e' , 'k');
        System.out.println(str7);
    }
}