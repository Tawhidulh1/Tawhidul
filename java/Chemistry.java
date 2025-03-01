import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
public class Chemistry {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			char[] chr = in.readLine().toCharArray();	
			HashMap<Character,Integer> count = new HashMap<Character, Integer>(26);
			for (int i = 0; i < chr.length; i++) {
				count.put(chr[i], count.getOrDefault(chr[i], 0) + 1);
			}
			int ctr = 0;
			for (Map.Entry<Character, Integer> entry : count.entrySet()) {
				if (entry.getValue() % 2 == 1) {
					ctr++;	
				}
			}
			if (ctr > k+1) {
				System.out.println("No");
				continue;
			}
			System.out.println("Yes");
		}
	}
}
