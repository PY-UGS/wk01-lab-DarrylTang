public class Main {
    public static void main (String[] args) {
        // 2a
        System.out.println("Hello, I am Darryl!");
        System.out.println("");

        // 2b
        String mod_code = "CSC1009";

        switch(mod_code)
        {
            case "CSC1006":
                System.out.println("Math 2");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Invalid course code!");
                break;
        }
        System.out.println("After switch statement");

        // 2c

        for(int x=102; x >= 66; x--) {
            // if x is odd then print
            if (x % 2 == 1) {
                System.out.println("value of x: " + x);
            }

        }

    }
}
