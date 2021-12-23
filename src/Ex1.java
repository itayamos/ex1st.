import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        if (num < 0) {
            num = -1 * num;
        }
        System.out.print(num);
    }
}
