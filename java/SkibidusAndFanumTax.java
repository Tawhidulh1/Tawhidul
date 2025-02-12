import java.util.Scanner;
public class SkibidusAndFanumTax {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for (int i = 0; i < n; i++){a[i] = in.nextInt();}
			for (int i = 0; i < m; i++){b[i] = in.nextInt();}
			boolean worked = true;
			for (int i = 0; i < m; i++){
				worked = true;
				for (int j = 0; j < n-1; j++){
					int d = b[i] - a[j];
					if ((j != 0 && !(d < a[j] && d >= a[j-1] && a[j+1] >= d))){
						worked = false;
					}
					else if (!(d <= a[j+1] && d < a[j])){
						worked = false;
					}
				}
				if (worked){
					break;
				}
			}
			if (worked){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
