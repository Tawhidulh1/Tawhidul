import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
