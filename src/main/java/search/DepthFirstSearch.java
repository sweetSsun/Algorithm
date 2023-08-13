package search;

import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearch {
    // 탐색 순서를 출력하기 위한 용도
    StringBuilder sb = new StringBuilder();

    public String dfs(int start, int[][] graph) {
        // 방문처리를 위한 boolean배열 선언
        boolean[] visited = new boolean[graph.length];

        recursion(start, graph, visited);

        return sb.toString();
    }

    public void recursion(int nodeIndex, int[][] graph, boolean[] visited) {
        visited[nodeIndex] = true;
        sb.append(nodeIndex + " ");
        for (int node : graph[nodeIndex]) {
            if (!visited[node]) {
                recursion(node, graph, visited);
            }
        }

    }

}
