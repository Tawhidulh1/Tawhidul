import java.util.Scanner;
import java.util.Arrays;
public class TwinPermutations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {a[i] = in.nextInt(); max = Math.max(max,a[i]);}
			int[] b= new int[n];
			for (int i = 0; i < n; i++){
				b[i] = max+1;
			}
			for (int i = 0; i < n; i++) {
				System.out.print(b[i] - a[i] + " ");
			}	
			System.out.println();
		}
	}
}
