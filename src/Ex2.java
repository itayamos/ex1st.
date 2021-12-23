import java.util.Scanner;
public class Ex2 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if(sum%2 == 0)
        {
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
}

