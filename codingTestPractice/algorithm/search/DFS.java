package codingTestPractice.algorithm.search;

import java.util.Arrays;
import java.util.Stack;

//인접 리스트 형태로 데이터가 정해질 때
public class DFS {

    public static void dfs1(int[][] graph, int v, boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");
        for(int i:graph[v]){
            if(visited[i]==false){
                dfs1(graph, i, visited);
            }
        }
    }

    public static void dfs2(int[][] graph, int v, boolean[] visited){
        Stack<Integer> stack = new Stack<>();

        stack.push(v);
        visited[v]=true;

        System.out.print(v+" ");

        while(!stack.isEmpty()){
            int curr = stack.peek();
            boolean foundNext=false;

            for(int i: graph[curr]){
                if(visited[i]==false){
                    stack.push(i);
                    visited[i]=true;
                    foundNext=true;
                    System.out.print(i + " ");
                    break;
                }
            }

            if(foundNext==false){
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {},
            {2, 3, 4},
            {1},
            {1, 4},
            {1, 3}
        };
        boolean[] visited = new boolean[graph.length];

        Arrays.fill(visited, false);
        dfs2(graph, 1, visited);

    }
}
