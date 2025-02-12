import java.util.Scanner;
public class ArrayColoring {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			int s = 0;
			for (int i = 0; i < n; i++){a[i] = in.nextInt(); s+=a[i];}
			if (s % 2 == 0){
				System.out.println("YES");
			}	
			else {
				System.out.println("NO");
			}
		}
	}
}
