import java.util.Scanner;

public class RemoveTheEnds {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++){
				a[i] = in.nextInt();
			}
			int max = Integer.MIN_VALUE;
			if (a[0] > 0){
				for (int i = n-1; i >= 0; i--){
					if (a[i] > 0){
						int val = 0;
						for (int l = i; l < n; l++){
							val += Math.abs(a[l]);
						}	
						max = Math.max(val,max);
					}
					else if (a[i] < 0){
						int val = 0;
						for (int r = n-1; r >= 0; r--){
							val+=Math.abs(a[r]);
						}
						max = Math.max(val,max);
					}
				}
			}
			else {
				for (int i = n-1; i >= 0; i--){
					if (a[i] > 0){
						int val = 0;
						for (int l = i; l < n; l++){
							val+=a[l];
						}
						max = Math.max(val,max);
					}
					else if (a[i] < 0){
						int val = 0;
						for (int r = n-1; r >= 0; r--){
							val+=a[r];
						}
						max = Math.max(max,val);
					}
				}
			}
			System.out.println(max);
		}
	}
}
