import java.util.Scanner;

public class lawOfLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        String data = sc.nextLine();

        System.out.println(data);

        // 왜 3개만 받아지고 종료가 될까? -> 엔터가 입력값으로 들어가기 때문이다.
    }
}