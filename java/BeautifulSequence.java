import java.util.Scanner;
public class BeautifulSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int ctr = 0;
			for (int i = 0; i < a.length; i++) {
				boolean works1 = false;
				boolean works2 = false;
				for (int j = 1; j < i; j++) {
					if(a[i] < a[j]) {
						works1 = true;
						break;
					}
				}
				for (int j = n-1; j > i; j--) {
					if (a[i] < a[j]) {
						works2 = true;
						break;
					}
				}
				if (works1 && works2) {
					ctr++;
				}
			}
			System.out.println(ctr);
		}
	}
}
