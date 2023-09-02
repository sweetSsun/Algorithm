import dynamic.DynamicProgramming;
import kruskal.Kruskal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicProgrammingTest {
    @Test
    public void dynamicProgramming() {
        DynamicProgramming dp = new DynamicProgramming();
        int num = dp.fibonacci(30);
        Assertions.assertEquals(832040, num);
    }
}
