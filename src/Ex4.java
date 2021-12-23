import java.util.Scanner;
public class Ex4 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        // a,b,c are part of the formula
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();
        double ans1 = ((-1*b + Math.sqrt( (Math.pow(b,2)) - 4*a*c))/(2*a));
        double ans2 = ((-1*b - Math.sqrt( (Math.pow(b,2)) - 4*a*c))/(2*a));
        System.out.println(ans1 +","+ ans2);

    }
}

