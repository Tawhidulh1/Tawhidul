import java.util.Scanner;
public class UnitArray {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int[] a = new int[n];
			int ne = 0;
			int on = 0;
			for (int i = 0; i < n; i++){
				a[i] = in.nextInt();
				if (a[i] == -1){
					ne++;
				}
				else {
					on++;
				}
			}
			int ctr = 0;
			if (n > 1 && ne == n){
				ctr++;
			}
			while(ne > on){
				on++;
				ne--;
				ctr++;
			}
			if (ne == on){
				System.out.println(1);
			}
			else {
				System.out.println(ctr);
			}
		}
	}
}
