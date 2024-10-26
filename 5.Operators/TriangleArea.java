import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();
        
        // Calculate the semi-perimeter
        int s = (a + b + c) / 2;
        
        // Calculate the area using Heron's formula
        int result = (int)Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("The area of the triangle is: " + result);
    }
}