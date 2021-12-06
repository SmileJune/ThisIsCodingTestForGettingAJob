import java.util.*;

public class EscapeMaze {

    public static int N, M;
    public static int[][] Array2D = new int[201][201];

    public static int dx[] = {1, -1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                Array2D[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println((bfs(0, 0)));
    }

    public static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx <= -1 || nx >= N || ny <= -1 || ny >= M) {
                    continue;
                }

                if (Array2D[nx][ny] == 1) {
                    Array2D[nx][ny] = Array2D[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }

            }
        }
        return Array2D[N - 1][M - 1];
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }
}
