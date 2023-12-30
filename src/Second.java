import java.util.Arrays;
import java.util.Scanner;
public class Second {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int leng = scan.nextInt();
        int[] numbers = new int[leng];
        float sum = 0F;


        for (int i = 0; i < numbers.length; i++) {
            int rand = (int)(Math.random() * 10);
            numbers[i] = rand;
            System.out.println(numbers[i]);
            sum += (float) numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println("Максимальное число " + numbers[numbers.length - 1]);
        System.out.println("Минимальное число " + numbers[0]);
        System.out.println("Среднее значение " + (sum / leng));
    }
}
