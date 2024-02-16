public class UnionFindUF {

    private static int[] id;
    public static void main(String[] args){
        int N = 10; 
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public static boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public static void union(int p, int q) {
        int P = p;
        int Q = q;
        for (int i = 0; i < id.length; i++) {
            if(id[i] == P) {
                id[i] = Q;
            }
        }
    }
}
