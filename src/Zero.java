import java.util.Scanner;
import java.util.Arrays;

public class Zero {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] numbers = {5,4,3,1,2,9,7,8,6};

        for (int num : numbers) {
            if (input == num) {
                System.out.println("Ваше число есть в массиве");
            } else {
                System.out.println("Такого числа в массиве нету");
            }
            break;
        }
    }
}
