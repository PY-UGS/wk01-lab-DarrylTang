import java.util.Scanner;

public class qn04 {
    public static void main(String[] args) {
//        Qn 4 =========
        Scanner input = new Scanner(System.in);
        String zodiacs[] = new String[]{"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit"
                , "Dragon", "Snake", "Horse", "Sheep"};

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int zodiacYear = year % 12;

        System.out.println("That year is the year of the "+zodiacs[zodiacYear]);
    }
}
