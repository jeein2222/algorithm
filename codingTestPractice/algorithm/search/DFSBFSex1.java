package codingTestPractice.algorithm.search;

import java.util.*;

import codingTestPractice.java.lambda.Comparable;

public class DFSBFSex1 {
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");
        for(int i: graph.get(v)){
            if(visited[i]==false){
                dfs(graph, i, visited);
            }
        }
    }

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited){
        Queue<Integer> queue=new LinkedList<>();

        queue.add(v);
        visited[v]=true;

        while(!queue.isEmpty()){
            int curr=queue.poll();
            System.out.print(curr+" ");
            for(int i: graph.get(curr)){
                if(visited[i]==false){
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int v=sc.nextInt();

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>(n+1);
        boolean[] visited=new boolean[n+1];
        Arrays.fill(visited, false);

        for(int i=0;i<n+1;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=0;i<n+1;i++){
            graph.get(i).sort(Comparator.naturalOrder());
        }


        dfs(graph,v,visited);
        Arrays.fill(visited, false);
        System.out.println();
        bfs(graph,v,visited);


    }
}
