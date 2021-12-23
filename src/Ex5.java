import java.util.Scanner;

public class Ex5 {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter jobtype 0 or 1");
        int num = scanner.nextInt();
        System.out.println("enter hours");
        int hour1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        System.out.println("enter days");
        int day1 = scanner.nextInt();
        int day2 = scanner.nextInt();
        System.out.println("how many days you have achieved the goal?");
        int achGoal1 = scanner.nextInt();
        int achGoal2 = scanner.nextInt();
        if (num == 1)
        {
            System.out.println((hour1 * day1 * 50 + achGoal1 * 250) + hour1 + day1);

        }
        else if (num == 0)
        {
            System.out.println((hour2 * day2 * 50 + achGoal2 * 250) + hour2 + day2);
        }
    }
}
