// package codingTestPractice.algorithm.search;
//
// import java.util.Arrays;
//
// //인접 행렬 형태로 데이터가 주어질 때
// public class DFS_v2 {
//
//     static int[][] graph; //인접 행렬
//     static boolean[] visited; //방문 여부
//
//     public static void dfs(int v){
//         visited[v]=true;
//         System.out.print(v + " ");
//
//         for(int i=0;i<graph.length;i++){
//             if(graph[v][i]==1 && !visited[i]){
//                 dfs(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=4; //노드의 수
//         graph = new int[][]{
//             {0, 1, 1, 0},
//             {1, 0, 0, 1},
//             {1, 0, 0, 0},
//             {0,1,0,0}
//         };
//         visited = new boolean[n][n];
//
//         for(boolean[] arr:visited){
//             Arrays.fill(arr, false);
//         }
//         dfs(0);
//     }
// }
