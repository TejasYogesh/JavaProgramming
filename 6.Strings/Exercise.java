public class Exercise {
    public static void main(String [] args){
        String str1 = "JavaProgram";
        System.out.println(str1);

        // By creation of the object in the code
        String str2 = new String("Java Programming");
        System.out.println(str2);


        // converstion of the char to the string and the byte to the string
        char ch[] = {'h' , 'e' , 'l' , 'l' , 'o'};
        String str3 = new String(ch);
        byte b[] = {65 , 66 , 67, 68};
        String str5 = new String(b);
        System.out.println(str5);

        // converstion of the string by the help of the offset and lenght of the code.
        String str4 = new String(b , 1, 3);
        System.out.println(str4);
        System.out.println(str3 + "Java Programming");
        System.out.println("Hello world");

        // Concept of the string object refering same object or the different object in the code = string literal.
        String strjava = "java";
        String strjava2 = "java";
        System.out.println(strjava == strjava2);

        // string object and the heap:
        String strHeap = new String("Java");
        String strNotHeap = new String("Java");
        System.out.println(strHeap == strNotHeap);
        // it gives the false : bcoz one is pointing to the strHeap and the another one is not strNotHeap



    }
}
