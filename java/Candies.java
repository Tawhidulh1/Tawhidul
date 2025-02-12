import java.util.Scanner;
public class Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] c = new int[in.nextInt()];
        for (int i = 0; i < c.length; i++) {
            c[i] = in.nextInt();
        }
        int A = in.nextInt();
        int B = in.nextInt();
        int sum = 0;
        for (int i = A; i < B+1; i++) {
           sum+=c[i]; 
        }
        System.out.println(sum);
    }
}
