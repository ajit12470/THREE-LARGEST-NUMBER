import java.util.Scanner;

public class ThreeLargestNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s1.nextInt();

        System.out.println("Enter the second number: ");
        int b = s1.nextInt();

        System.out.println("Enter the second number: ");
        int c = s1.nextInt();

        if (a >= b && a >= c) {
            System.out.println("first largest number " + a);
        } else if (b >= a && b >= c) {
            System.out.println("second largest number " + b);
        } else {
            System.out.println("third largest number: " + c);
        }
        s1.close();
    }
}
