import java.io.*;
import java.util.StringTokenizer;
public class MeasuringTraffic {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("traffic.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("traffic.out")));
		int N = Integer.parseInt(in.readLine());
		String[] s = new String[N];
		int[][] n = new int[N][2];				
		while (in.ready()){
			for (int i = 0; i < N; i++){
				StringTokenizer st = new StringTokenizer(in.readLine());
				s[i] = st.nextToken(); 
				n[i][0] = Integer.parseInt(st.nextToken());
				n[i][1] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++){
			if (s[i].equals("on")){
				int a = n[i][0];
				int b = n[i][1];
				int a2 = 0;
				int b2 = 0;
				int aMax = Integer.MIN_VALUE;
				int bMin = Integer.MAX_VALUE;
				for (int j = i; j < N; j++){
					if (s[j].equals("off")){
						a2 = n[j][0];
						b2 = n[j][1];
						break;
					}
					if (j==i){
						continue;
					}
					int x = n[j][0];
					int y = n[j][1];
					if (x > aMax){
						aMax = x;
					}
					if (y < bMin){
						bMin = y;
					}
				}
				aMax-=a;
				bMin-=b;	
				out.println(aMax+" "+bMin);
				aMax+=a;
				bMin+=b;
				aMax+=a2;
				bMin+=b2;
				out.println(aMax+" "+bMin);
			}
		}		
		out.close();
		in.close();
	}
}
