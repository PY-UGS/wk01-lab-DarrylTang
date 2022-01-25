import java.util.Scanner;

public class qn02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Qn 2 =======
        System.out.print("Please input 3 numbers: ");
        float inpt1 = input.nextFloat();
        float inpt2 = input.nextFloat();
        float inpt3 = input.nextFloat();
        float average = (inpt1 + inpt2 + inpt3) / 3;
        System.out.print("The average of the 3 numbers is "+ average);
    }
}
