import java.util.Scanner;
public class LineBreaks {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int m = in.nextInt();
			String[] s = new String[n];
			in.nextLine();
			for (int i = 0; i < n; i++){
				s[i]=in.nextLine();
			}
			int ctr = 0;
			int ind = 0;
			while (true && ind < s.length){
				m-=s[ind].length();
				if (m < 0){
					break;
				}
				else if (m == 0){
					ctr = ind+1;	
					break;
				}
				else {
					ctr++;
				}
				ind++;
			}
			System.out.println(ctr);
		}
	}
}
