import java.util.Scanner;
import java.util.Arrays;
public class GorillaAndTheExam {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int[] a = new int[in.nextInt()];
			int k = in.nextInt();
			for (int i = 0; i < a.length; i++){
				a[i] = in.nextInt();
			}
			int ret = a.length;
			String found = "";
			for (int i = 0; i < a.length-1; i++){
				for (int j = i+1; j < a.length; j++){
					if (found.indexOf(a[i]+"") == -1 && a[i] == a[j]){
						found+=a[i]+"";
						ret--;
					}
				}
			}
			ret-=k;
			System.out.println(ret);
		}
	}
}
