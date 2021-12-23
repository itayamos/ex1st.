import java.util.Scanner;

public class Ex6 {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the a1");
        int a1 = scanner.nextInt();
        System.out.println("enter d");
        int d = scanner.nextInt();
        System.out.println("enter cap");
        int cap = scanner.nextInt();
        int count = 1;
        while (count==cap)
        {
            int a = a1 + count*d;
            System.out.println(a1+","+a+",");
            count++;
        }




    }
}
