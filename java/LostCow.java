import java.io.*;
import java.lang.Math;
import java.util.StringTokenizer;

public class LostCow {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("lostcow.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lostcow.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
			

		int dx = 1;
		int sum = 0;
		int cur = x;
		int prev = x;
		while (true){
			cur = x+dx;
			dx*=-2;
			if ((prev <= y && y <= cur) || (y <= prev && cur <= y)){
				sum+=Math.abs(y-prev);
				break;
			}
			sum+=Math.abs(cur-prev);
			prev = cur;
		}
		out.println(sum);
		in.close();
		out.close();
	}
}
