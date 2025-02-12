import java.util.Scanner;
public class LineTrip {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int x = in.nextInt();
			boolean[] g = new boolean[x+1];
			for (int i = 0; i < g.length; i++){
				g[i]=false;
			}
			for (int i = 0; i < n; i++){
				g[in.nextInt()]=true;
			}
			int min = Integer.MAX_VALUE;
			for (int gas = 1; gas <=x; gas++){
				int ga = gas;	
				ga--;
				int dir = 1;
				int pos = 1;
				while (pos != 0 && !(ga < 0)){
					if (g[pos]){
						ga = gas;
					}
					else {
						ga--;
					}
					if (pos == x){
						dir*=-1;
					}
					System.out.print(":"+pos+"-"+ga+":");
					pos+=dir;
				}
				System.out.println();
				if (pos == 0 && ga>=0){
					min = Math.min(min,ga);
				}
			}
			System.out.println(min);
		}
	}
}
