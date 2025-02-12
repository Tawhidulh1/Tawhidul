import java.util.Scanner;
import java.lang.StringBuilder;
public class GrassHopperOnALine {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int x = in.nextInt();
			int k = in.nextInt();
			StringBuilder ret = new StringBuilder("");	
			int ctr = 0;
			for (int i = x; i > 0; i--){
				if (i % k != 0){
					ctr = 2;
					ret.append(i+" ");
					if (!(x-i <= 0)){
						ret.append(x-i);
					}
					else {
						ctr = 1;
					}
					break;
				}
			}
			System.out.println(ctr);
			System.out.println(ret);
		}
	}
}
