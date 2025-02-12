import java.util.Scanner;
public class Desorting {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			a[0] = in.nextInt();
			int ctr = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++){
				a[i]=in.nextInt();
				if (a[i] < a[i-1]){
					ctr = -1;	
				}
				if (min > a[i]-a[i-1]){
					min = a[i]-a[i-1];
				}
			}
			if (ctr == -1){
				System.out.println(0);
			}
			else {
				System.out.println(min/2+1);
			}
		}
	}
}
