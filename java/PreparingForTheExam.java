import java.util.Scanner;
public class PreparingForTheExam{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();	
			int m = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[m];
			int[] q = new int[k];
			for (int i=0;i<m;i++){
				a[i] = in.nextInt();
			}
			for (int i=0;i<k;i++){
				q[i] = in.nextInt();
			}
			boolean[] used = new boolean[n+1];
			for (int each : q){
				used[each] = true;
			}
			for (int i = 0; i < m; i++){
				if (q.length == n || (q.length == n-1 && !used[a[i]])){
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		in.close();
	}
}
