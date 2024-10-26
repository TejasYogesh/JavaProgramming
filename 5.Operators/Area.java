import java.lang.*;
import java.util.*;
public class Area {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        float area , length , breadth;
        System.out.println("Enter Length");
        length = input.nextFloat();
        breadth = input.nextFloat();
        float answer = (length*breadth);
        // area = (1/2)*(length*breadth);
        area = answer*0.5f;
        System.out.println("Area of Rectangle is " + area);
    }
}
