import java.util.Scanner;
public class BlankSpace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int ctr = 0;
			int cur = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					cur++;
				}
				if (a[i] == 1) {
					cur = 0;
				}
				ctr = Math.max(ctr,cur);
			}
			System.out.println(ctr);
		}
	}
}
