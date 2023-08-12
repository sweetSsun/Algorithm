package search;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public String bfs(int start, int[][] graph) {
        // 방문처리를 위한 boolean배열 선언
        boolean[] visited = new boolean[graph.length];
        // 탐색 순서를 출력하기 위한 용도
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        // 첫번째 노드 방문
        q.add(start);
        visited[start] = true;

        // 큐가 빌 때까지 반복하며 모든 노드 방문
        while(!q.isEmpty()) {
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " ");
            for (int i = 0; i < graph[nodeIndex].length; i++) {
                int node = graph[nodeIndex][i];
                if (!visited[node]) {
                    q.add(node);
                    visited[node] = true;
                }
            }
        }

        return sb.toString();
    }

}
