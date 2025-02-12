import java.util.Scanner;
public class TenderCarpenter {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int[] a = new int[in.nextInt()];
			if (a.length == 2 && a[0] != a[1]){
				System.out.println("NO");
				continue;
			}
			for (int i = 0; i < a.length; i++){
				a[i] = in.nextInt();
			}
			int ctr = 0;
			boolean worked = false;
			for (int i = 0; i < a.length-1; i++){
				int x = a[i];	
				int y = a[i+1];
				if (x*2 > y && y*2 > x){
					ctr++;
				}
			}
			for (int i = 1; i < a.length; i++){
				int x = a[i];	
				int y = a[i-1];
				if (x*2 > y && y*2 > x){
					ctr++;
				}
			}
			if (ctr >= 2){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
