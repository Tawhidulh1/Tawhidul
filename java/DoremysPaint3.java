import java.util.Scanner;
public class DormeysPaint3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();	
			int[] a = new int[n];
			for (int i = 0; i < n; i++){
				a[i] = in.nextInt();
			}
		}
	}
}
