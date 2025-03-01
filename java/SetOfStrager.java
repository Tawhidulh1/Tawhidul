import java.util.Scanner;
public class SetOfStrager {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[n*m];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			int ctr = 0;
			for (int i = 1; i < a.length-1; i++) {
				if (!(a[i-1] == a[i+1])) {
					ctr++;
					a[i+1] = a[i-1];
				}
			}
			System.out.println(ctr);
		}
	}
}
