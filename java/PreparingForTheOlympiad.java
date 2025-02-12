import java.util.Scanner;
public class PreparingForTheOlympiad {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++){a[i] = in.nextInt();}
			for (int i = 0; i < n; i++){b[i] = in.nextInt();}
			int min = a[0];
			for (int i = 0; i < a.length; i++){
				if (a[i] < min){
					min=a[i];
				}
			}
			int ans = a[n-1];
			for (int i = 0; i < n-1; i++){
				ans+=Math.max(0,a[i]-b[i+1]);
			}
			System.out.println(ans);
		}
	}
}
