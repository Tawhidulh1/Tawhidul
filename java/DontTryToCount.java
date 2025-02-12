import java.io.*;
import java.util.StringTokenizer;
public class DontTryToCount {
	public static void main(String[]args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < t; tc++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			String x = in.readLine();
			String s = in.readLine();
			int ctr = 0;
			if (n == m && (x+x).indexOf(s)!=-1){
				ctr = 1;
			}
			else if (n==m){
				ctr = 0;
			}
			else if (n > m && x.indexOf(s)!=-1){
				ctr = 0;
			}
			else if (n > m){
				ctr = 1;
			}
			
			else {
				while (x.indexOf(s)==-1 && x.length()<n*m*2){
					x+=x;
					ctr++;
				}
			}
			if (!(x.length()<n*m*2)){
				System.out.println(-1);
			}
			else {
				System.out.println(ctr);
			}	
		}
	}
}
