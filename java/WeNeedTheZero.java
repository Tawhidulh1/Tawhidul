import java.util.Scanner;
public class WeNeedTheZero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0){
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {a[i] = in.nextInt();}
			int x = a[0];
			for (int i = 1; i < n; i++) {
				x = x^a[i];
			}
			if (x == 0) {
				System.out.println(0);
			}
			else {
				if (n % 2 == 1) {
					System.out.println(x);
				}
				else {
					System.out.println(-1);
				}
			}
		}
	}
}
