import kruskal.Kruskal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KruskalTest {
    // 그래프를 2차원 배열로 표현해줍니다.
    // 배열 안의 배열에서 0, 1번 인덱스는 두 개의 노드를, 2번 인덱스는 간선의 가중치를 의미합니다.
    int[][] graph = {{1, 7, 12}, {1, 4, 28}, {1, 2, 67}, {1, 5, 17}, {2, 4, 24}, {2, 5, 62}, {3, 5, 20}, {3, 6, 37}, {4, 7, 13}, {5, 6, 45}, {5, 7, 73}};
    int[] parentArr = new int[8];

    @Test
    public void kruskal() {
        for (int i = 0; i < parentArr.length; i++) {
            parentArr[i] = i;
        }

        Kruskal kk = new Kruskal();
        int total = kk.kruskal(graph, parentArr);
        Assertions.assertEquals(123, total);
    }
}