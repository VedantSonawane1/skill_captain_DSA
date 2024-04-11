import java.util.*;

class RedundantEdgeFinder {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        
        int[] redundantEdge = new int[2];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int parentU = find(parent, u);
            int parentV = find(parent, v);
            if (parentU == parentV) {
                redundantEdge = edge;
            } else {
                parent[parentV] = parentU;
            }
        }
        
        return redundantEdge;
    }
    
    private int find(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent, parent[x]);
    }
}
