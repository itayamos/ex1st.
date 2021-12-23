import java.util.Scanner;

public class Ex3 {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        System.out.println("enter num3");
        int num3 = scanner.nextInt();
        if(num1 > num2)
        {
            if(num2 > num3)
            {
                System.out.println(num1 +","+ num2 +","+ num3);
            }
            else
                System.out.println(num1 +","+ num2 +","+ num3);

        }
        else if (num2 > num1)
        {
            if (num1 > num3)
            {
                System.out.println(num2 +","+ num1 +","+ num3);
            }
            else
                System.out.println(num2 +","+ num3 +","+ num1);
        }
        else if (num3 > num1)
        {
            if(num1 > num2)
            {
                System.out.println(num3 +""+ num1 +""+ num2);
            }
            else
                System.out.println(num3 +""+ num2 +""+ num1);
        }
    }
}

