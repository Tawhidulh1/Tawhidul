import java.io.*;
import java.util.StringTokenizer;
public class SquarePasture {
	public static void main (String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("square.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
		int[] x = new int[4];
		int[] y = new int[4];
		StringTokenizer st = new StringTokenizer(in.readLine());
		x[0] = Integer.parseInt(st.nextToken());	
		y[0] = Integer.parseInt(st.nextToken());	
		x[1] = Integer.parseInt(st.nextToken());	
		y[1] = Integer.parseInt(st.nextToken());	
		st = new StringTokenizer(in.readLine());
		x[2] = Integer.parseInt(st.nextToken());	
		y[2] = Integer.parseInt(st.nextToken());	
		x[3] = Integer.parseInt(st.nextToken());	
		y[3] = Integer.parseInt(st.nextToken());	
		int mxX = x[0];
		int mxY = y[0];
		int mnX = x[0]; 
		int mnY = y[0];	
		for (int i = 0; i < 4; i++){
			mxX = Math.max(mxX,x[i]);
			mxY = Math.max(mxY,y[i]);
			mnY = Math.min(mnY,y[i]);
			mnX = Math.min(mnX,x[i]);
		}
		int d = 0;
		if (Math.abs(mnX-mxX) > Math.abs(mxY-mnY)){
			d=Math.abs(mnX-mxX);
		}
		else if (Math.abs(mnX-mxX) < Math.abs(mxY-mnY)){
			d=Math.abs(mnY-mxY);
		}
		else {
			d=Math.abs(mnY-mxY);
		}
		out.println((int)(Math.pow(d,2)));
		out.close();
		in.close();
	}
}
