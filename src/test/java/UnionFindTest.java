import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import search.BreadthFirstSearch;
import search.DepthFirstSearch;
import unionFind.UnionFind;

public class UnionFindTest {

    UnionFind uf = new UnionFind();
    int[] parentArr = new int[11];

    @Test
    public void ufTest() {
        for (int i = 0; i < parentArr.length; i++) {
            parentArr[i] = i;
        }

        uf.unionFind(parentArr, 1, 3);
        uf.unionFind(parentArr, 1, 5);
        uf.unionFind(parentArr, 2, 4);
        uf.unionFind(parentArr, 6, 8);
        uf.unionFind(parentArr, 5, 4);
        uf.unionFind(parentArr, 10, 8);
        uf.unionFind(parentArr, 8, 9);
        Assertions.assertFalse(uf.isSameParent(parentArr, 2, 10));
        Assertions.assertTrue(uf.isSameParent(parentArr, 6, 9));
        Assertions.assertFalse(uf.isSameParent(parentArr, 7, 8));

        uf.unionFind(parentArr, 10, 4);
        uf.unionFind(parentArr, 7, 8);
        Assertions.assertTrue(uf.isSameParent(parentArr, 5, 6));
        Assertions.assertTrue(uf.isSameParent(parentArr, 5, 7));
    }
}
