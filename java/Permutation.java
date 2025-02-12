import java.util.Scanner;
public class Permutation {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ret = new int[2*n];
		ret[0] = 1;
		for (int i = 1; i < 2*n; i++){
			if (k == 0){
				ret[i] = i+1;
			}
			else {
				ret[i] = ret[i-1]+k;
			}
		}
		for (int each : ret){
			System.out.print(each+" ");
		}
		
	}
}
