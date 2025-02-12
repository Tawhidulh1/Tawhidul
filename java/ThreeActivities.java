import java.util.Scanner;
public class ThreeActivities{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++){a[i] = in.nextInt();}
			for (int i = 0; i < n; i++){b[i] = in.nextInt();}
			for (int i = 0; i < n; i++){c[i] = in.nextInt();}
			int am = Integer.MIN_VALUE;
			int bm = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++){
				if (am < a[i] && a[i] > b[i]){
					am = a[i];
				}	
				else if (bm < b[i] && b[i] > a[i]){
					bm = b[i];
				}
			}
			int sum = am + bm;
			for (int i = 0; i < n; i++){
				if (c[i] != am || c[i] != bm){
					sum = Math.max(sum,am+bm+c[i]);
				}
			}
			System.out.println(sum);
		}
	}
}
