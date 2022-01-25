import java.util.Scanner;

public class qn03 {
    public static void main(String[] args) {
//        Qn 3 =========
        Scanner input = new Scanner(System.in);
        long totalMiliseconds = System.currentTimeMillis();
        System.out.println("");
        System.out.println("miliseconds since epoach "+totalMiliseconds);

        long totalseconds = totalMiliseconds/1000;
        long currentSecs = totalseconds % 60;

        long totalminutes = totalseconds/60;
        long currentMins = totalminutes % 60;

        long totalhours = totalminutes / 60;
        long currentHours = totalhours % 24;

        System.out.println("Time now is: "+currentHours+":"+currentMins+":"+currentSecs);
    }
}
