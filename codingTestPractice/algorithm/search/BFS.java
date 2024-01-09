package codingTestPractice.algorithm.search;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(int[][] graph, int v, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(v);
        visited[v]=true;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr+" ");

            for(int i:graph[curr]){
                if(visited[i]==false){
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] graph = {
            {},
            {2, 3, 4},
            {1, 4},
            {1, 4},
            {1, 2, 3}
        };

        boolean[] visited = new boolean[graph.length];

        Arrays.fill(visited, false);

        bfs(graph,1,visited);
    }
}
