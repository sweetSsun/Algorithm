package kruskal;

import java.util.Arrays;
import java.util.Comparator;

public class Kruskal {

    // 크루스칼 알고리즘은 unionFind를 활용한다.
    public int getParent(int[] parent, int x) {
        if (parent[x] == x) return x;
        return parent[x] = getParent(parent, parent[x]);
    }

    public void union(int[] parent, int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public boolean isSameParent(int[] parent, int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        return a == b ? true : false;
    }

    public int kruskal(int[][] graph, int[] parent) {
        // 최소 간선부터 연결시키기 위해 간선 가중치순으로 정렬
        Arrays.sort(graph, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        int total = 0;
        for (int i = 0; i < graph.length; i++) {
            // 사이클을 형성하지 않기 위해 부모가 다를 때만 연결한다.
            if (!isSameParent(parent, graph[i][0], graph[i][1])) {
                total += graph[i][2];
                union(parent, graph[i][0], graph[i][1]);
            }
        }

        return total;
    }
}
