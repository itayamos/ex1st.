import java.util.Scanner;
public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(fun1(num1,num2));
        System.out.println(fun2(num1,num2));
        fun3(num1,num2);
    }

    public static boolean fun1(int num1, int num2) {
        return num1 % num2 == 0;
    }

    public static boolean fun2(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            while (!fun1(num1, num2) && num2 != 1) {
                num2--;
            }
            return true;
        }
        else
            return false;
    }
    public static void fun3(int num1, int num2){
        if (num1>0 && num2>0){
            while (fun2(num1, num2) && num1>1){
                System.out.println(num1 + ",");
                num1--;
            }
        }
        else
            System.out.println("enter different numbers");
    }
}

