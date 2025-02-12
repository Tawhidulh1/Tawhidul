import java.io.*;
import java.util.StringTokenizer;
public class BlockedBillboard {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter(new FileWriter("billboard.out"));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int ax1 = Integer.parseInt(st.nextToken()); int ay1 = Integer.parseInt(st.nextToken()); int ax2 = Integer.parseInt(st.nextToken()); int ay2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		int bx1 = Integer.parseInt(st.nextToken()); int by1 = Integer.parseInt(st.nextToken()); int bx2 = Integer.parseInt(st.nextToken()); int by2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		int tx1 = Integer.parseInt(st.nextToken()); int ty1 = Integer.parseInt(st.nextToken()); int tx2 = Integer.parseInt(st.nextToken()); int ty2 = Integer.parseInt(st.nextToken());
		boolean[][] visible = new boolean[2000][2000];
		for (int x = ax1; x < ax2; x++){
			for (int y = ay1; y < ay2; y++){
				visible[x][y] = true;
			}
		}
		for (int x = bx1; x < bx2; x++){
			for (int y = by1; y < by2; y++){
				visible[x][y] = true;
			}
		}
		for (int x = tx1; x < tx2; x++){
			for (int y = ty1; y < ty2; y++){
				visible[x][y] = false;
			}
		}	
		int ctr = 0;
		for (int i = 0; i < visible.length; i++){
			for (int j = 0; j < visible.length; j++){
				if (visible[i][j]){
					ctr++;
				}
			}
		}
		out.println(ctr);
		out.close();
		in.close();
	}
}
