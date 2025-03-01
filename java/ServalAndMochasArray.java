import java.util.Scanner;
public class ServalAndMochasArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			boolean[] b = new boolean[n];
			for (int i = 0; i < n; i++) {a[i]=in.nextInt(); b[i] = true;} 
			for (int i = 0; i < n; i++) {
				if (!(a[i] % (i+1) == 0)) {
					b[i] = false;
				}
			}
			for (int i = 0; i < n; i++) {
				if (a[i] % (i+1) != 0) {
					b[i] = false;
				}
			}
			boolean worked = false;
			for (int i = 0; i < n; i++) {
				if (b[i]) {
					worked = true;
					break;
				}
			}
			if (worked) {
				System.out.println("Yes");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
