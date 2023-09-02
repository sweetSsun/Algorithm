package dynamic;

public class DynamicProgramming {

    private int[] d = new int[100];

    public int fibonacci (int x) {
        if (x == 1 || x == 2) return 1;
        if (d[x] != 0) return d[x];
        return d[x] = fibonacci(x-1) + fibonacci(x-2);
    }
}
