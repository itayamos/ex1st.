import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        if(num>=5 && num<=20)
        {
            System.out.println(num);
        }
        else
            System.out.println("enter num again");
        multiPrint(num);
    }
    public static void multiPrint (int num)
    {
        while (num!=0)
        {
            System.out.println('*');
            num--;
        }
    }
}
