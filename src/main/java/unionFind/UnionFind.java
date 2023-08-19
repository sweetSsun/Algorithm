package unionFind;

public class UnionFind {

    public int getParent(int[] parent, int x) {
        if (x == parent[x]) return x;
        return parent[x] = getParent(parent, parent[x]);
    }

    public void unionFind(int[] parent, int a, int b) {
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
}
