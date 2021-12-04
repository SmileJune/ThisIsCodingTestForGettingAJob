import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static boolean[] visited = new boolean[9];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                q.offer(y);
                visited[y] = true;
            }
        }

    }


}
