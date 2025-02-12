import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int L = in.nextInt();
        int a = in.nextInt();
        int prev = 0;
        int breaks = 0;
        if (n == 0) {
            System.out.println(L/a);
            return;
        }
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            int l = in.nextInt();
            int gap = t - prev;
            breaks+=(gap)/a;  
            prev = t+l;
        } 
        breaks+=(L - prev)/a; 
        System.out.println(breaks);
    }
}
