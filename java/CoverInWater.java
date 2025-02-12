import java.io.*;
import java.util.StringTokenizer;
public class CoverInWater {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());	
		for (int tc = 0; tc < t; tc++){
			int n = Integer.parseInt(in.readLine());
			String str = in.readLine();
			int ctr = str.length();
			if (str.indexOf("...")!=-1){
				ctr = 2;
			}
			else {
				for (int i = 0; i < str.length(); i++){
					if (str.substring(i,i+1).equals("#")){
						ctr--;
					}
				}
			}
			System.out.println(ctr);
		}
	}
}
