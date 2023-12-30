import java.util.Scanner;
public class First {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] numbers = {1,2,4,3,2,1,2,3};
        int[] copyNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == input) {
                continue;
            }
            copyNumbers[i] = numbers[i];
            System.out.println(copyNumbers[i]);
        }
    }
}
