import java.util.Scanner;
import java.util.Arrays;
public class MilyaAndTwoArrays {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < a.length; i++){a[i] = in.nextInt();}
			for (int i = 0; i < b.length; i++){b[i] = in.nextInt();}
			Arrays.sort(a);	
			for (int i = 0; i < n; i++){
				c[i] = a[i]+b[i];
				System.out.println(c[i]);
			}
			int ctr = 0;
			for (int i = 0; i < n; i++){
				while (i < n-1 && c[i] == c[i+1]){
					i++;
				}
				ctr++;
			}
			if (ctr >= 3){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
