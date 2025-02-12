import java.util.Scanner;
public class GoalsOfVictory {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			int s = 0;
			for (int i =0 ;i  < n-1; i++){
				a[i] = in.nextInt();
				if (a[i] < 0){
					s+=Math.abs(a[i]);
				}
				else {
					s-=a[i];
				}
			}
			System.out.println(s);

		}
	}
}
