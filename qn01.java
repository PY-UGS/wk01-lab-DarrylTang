import java.util.Scanner;

public class qn01 {
    public static void main(String[] args) {
//        Qn 1 =========
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Enter a number for radius: ");
        float radius = input.nextFloat();

        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius "+radius+" is "+area);
    }
}
