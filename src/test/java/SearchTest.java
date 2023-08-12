import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import search.BreadthFirstSearch;

public class SearchTest {

    // 그래프를 2차원 배열로 표현해줍니다.
    // 배열의 인덱스를 노드와 매칭시켜서 사용하기 위해 인덱스 0은 아무것도 저장하지 않습니다.
    // 1번인덱스는 1번노드를 뜻하고 노드의 배열의 값은 연결된 노드들입니다.
    int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    @Test
    public void bfsTest () {
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        String expectedStr = "1 2 3 8 6 5 4 7 ";
        String actualStr = bfs.bfs(1, graph);

        Assertions.assertEquals(expectedStr, actualStr);
    }
}
