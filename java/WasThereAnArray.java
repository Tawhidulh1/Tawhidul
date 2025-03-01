import java.util.Scanner;
public class WasThereAnArray {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 1; i < n-1; i++) {
				a[i] = in.nextInt();
			}
			int min = Integer.MAX_VALUE;
			boolean works = true;
			for (int i = 1; i < n-3; i++) {
				if (a[i] == 1 && a[i+1] == 0 && a[i+2] == 1) {
					works = false;
					break;
				}
			}
			if (works) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
