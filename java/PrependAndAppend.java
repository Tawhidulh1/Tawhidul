import java.io.*;
public class PrependAndAppend {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(in.readLine());
			String str = in.readLine();
			if (n==1) {
				System.out.println(n);
				continue;
			}
			int l = 0;
			int r = n-1;
			int ctr = 0;
			while (l < r && !str.substring(l,l+1).equals(str.substring(r,r+1))) {
				l++;
				r--;
				ctr+=2;	
			}
			System.out.println(n-ctr);
		}
	}
}
