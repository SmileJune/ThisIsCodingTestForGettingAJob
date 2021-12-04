import java.util.Scanner;

public class FreezeIce {

    public static int n,m;
    public static int[][] graph = new int[1000][1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }

        System.out.println(result);

    }

    public static boolean dfs(int i, int j) {

        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        if (graph[i][j] == 0) {
            graph[i][j] = 1;
            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j - 1);
            dfs(i, j + 1);
            return true;

        }
        return false;
    }
}
