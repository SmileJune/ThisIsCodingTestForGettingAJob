import java.util.Arrays;
import java.util.Scanner;

public class lawOfLargeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);
        int theMostLargestNumber = data[n - 1];
        int secondLargestNumber = data[n - 2];

        int[] oneCycleArray = new int[k + 1];
        setOneCycleArray(k, theMostLargestNumber, secondLargestNumber, oneCycleArray);

        int cnt = 0;
        int sum = 0;
        System.out.println(getSum(m, oneCycleArray, cnt, sum));
    }

    private static int getSum(int m, int[] oneCycleArray, int cnt, int sum) {
        for (int i = 0; i < oneCycleArray.length; i++) {
            sum += oneCycleArray[i];
            cnt++;
            if (cnt == m) {
                break;
            }
            if (i == oneCycleArray.length - 1) {
                i = -1;
            }
        }
        return sum;
    }

    private static void setOneCycleArray(int k, int theMostLargestNumber, int secondLargestNumber, int[] oneCycleArray) {
        for (int i = 0; i < k; i++) {
            oneCycleArray[i] = theMostLargestNumber;
        }
        oneCycleArray[k] = secondLargestNumber;
    }
}
