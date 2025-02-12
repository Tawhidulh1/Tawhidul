import java.util.Scanner;
import java.util.Arrays;
public class HalloumiBoxes {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			int[] ret = new int[n];
			for (int i = 0;i < a.length; i++){ a[i] = in.nextInt(); ret[i] = a[i]; }
			Arrays.sort(a);
			boolean sorted = true;
			for (int i = 0; i < ret.length; i++){
				if(a[i] != ret[i]) {
					sorted = false;
				}
			}
			if (sorted || k > 1){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
