import kruskal.Kruskal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import treeOrder.TreeOrder;

public class TreeOrderTest {
    TreeOrder.Node[] arr = new TreeOrder.Node[16];

    @BeforeEach
    public void beforeEach() {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = new TreeOrder.Node(i, null, null);
        }
        for (int i = 2; i < arr.length; i++) {
            if (i % 2 == 0) arr[i / 2].setLeftChild(arr[i]);
            else arr[i / 2].setRightChild(arr[i]);
        }
    }

    @Test
    public void preOrder() {
        TreeOrder to = new TreeOrder();
        String actual = to.preOrder(arr[1]);

        String expected = "1 2 4 8 9 5 10 11 3 6 12 13 7 14 15 ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void inOrder() {
        TreeOrder to = new TreeOrder();
        String actual = to.inOrder(arr[1]);

        String expected = "8 4 9 2 10 5 11 1 12 6 13 3 14 7 15 ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void postOrder() {
        TreeOrder to = new TreeOrder();
        String actual = to.postOrder(arr[1]);

        String expected = "8 9 4 10 11 5 2 12 13 6 14 15 7 3 1 ";
        Assertions.assertEquals(expected, actual);
    }
}