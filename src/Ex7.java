import java.util.Scanner;
public class Ex7 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter day");
        int day = scanner.nextInt();
        System.out.println("enter hour");
        int hour = scanner.nextInt();
        if (day > 0 && day <= 7 && hour >= 0 && hour < 24)
        {
            if (day==6 || day==7)
            {
                System.out.println("closed");
            }
            if(day==1 || day==2 || day==4 || day==5)
            {
                if(hour>=9 && hour<=17)
                {
                    System.out.println("welcome");
                }
                else
                    System.out.println("we are open between 9-17");
            }
            else if(day==3)
            {
                if(hour>=8 && hour<=12)
                {
                    System.out.println("welcome");
                }
                else
                    System.out.println("we are open between 8-12");
            }
        }
    }
}



