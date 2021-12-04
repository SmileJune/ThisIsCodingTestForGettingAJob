import java.util.ArrayList;

public class DFS {
    static boolean[] visited = new boolean[9];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    static void dfs(int x){

        visited[x] = true;
        for(int i=0; i<graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y);
        }
    }

}
