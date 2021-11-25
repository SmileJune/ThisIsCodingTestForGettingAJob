import java.util.Scanner;

public class untilItBecomes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = getCount(n, k);
        System.out.println(count);
    }

    private static int getCount(int n, int k) {
        int count = 0;
        while (n != 1) {
            if (n % k == 0) {
                n /= k;
                count++;
            } else {
                n -= 1;
                count++;
            }
        }
        return count;
    }
}
