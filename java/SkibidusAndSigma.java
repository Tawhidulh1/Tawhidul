import java.util.Scanner;
public class SkibidusAndSigma {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[m*n];
			int s = 0;
			for (int i = 0; i < m*n; i++){a[i] = in.nextInt();for (int j = 0; j < m*n-i;j++){s+=a[i];}}
			System.out.println(s);

		}
	}
}
