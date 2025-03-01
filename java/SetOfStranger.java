import java.util.Scanner;

public class SetOfStranger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[][] a = new int[n][m];
			int b = 0;
			int[] d = new int[n*m+1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = in.nextInt();
				}
			}
			int ctr = 0;
			int max = 0;
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < m; c++) {
					b++;
					if (r + 1 < n && a[r][c] == a[r+1][c]) {
						ctr++;
					}
					if (c + 1 < m && a[r][c] == a[r][c+1]){
						ctr++;
					}
				}
			}
			System.out.println(b+ctr-1);
		}
	}
}
