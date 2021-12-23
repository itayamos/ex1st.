import java.util.Scanner;
import java.util.Random;

public class Ex10 {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int min = 1;
        int max = 1000;
        Random r = new Random();
        int ranum = r.nextInt(max-min)+1;
        int count1 = 0;
        System.out.println("take your guess user 1");
        int guess1 = scanner.nextInt();
        System.out.println("take your guess user 2");
        int guess2 = scanner.nextInt();
        int count2 = 0;
        do {
            guess1 = scanner.nextInt();
        }
        while (ranum == guess1);
        {

            count1++;
        }
        do {
            guess2 = scanner.nextInt();
        }
        while (ranum == guess2);
        {
            count2++;
        }
        if(count1 > count2)
        {
            System.out.println("player 2 won" + count2);
        }
        else
        {
            System.out.println("player 1 won" + count1);
        }
    }
}

