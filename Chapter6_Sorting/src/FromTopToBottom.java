import java.util.Arrays;
import java.util.Scanner;

public class FromTopToBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
