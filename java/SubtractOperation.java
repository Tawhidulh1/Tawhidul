import java.util.Scanner;
public class SubtractOperation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++){a[i]=in.nextInt();}
			boolean works = false;
			for (int i =0; i < a.length; i++){
				for (int j = 0; j < a.length; j++){
					if (Math.abs(a[i]-a[j]) == k){
						works = true;
					}	
				}
			}
			if (works){
				System.out.println("YES");	
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
