import java.io.*;
import java.util.*;
public class SpeedingTicket {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("speeding.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> speed = new ArrayList<Integer>();		
		ArrayList<Integer> bspeed = new ArrayList<Integer>();		
		for (int i = 0; i < N; i++){
			st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j = 0; j < a; j++){
				speed.add(b);
			}
		}	
		for (int i = 0; i < M; i++){
			st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for (int j = 0; j < a; j++){
				bspeed.add(b);
			}
		}
		int max = 0;
		int i = 0;
		while (i < 100){
			if (max < bspeed.get(i) - speed.get(i)){
				max = bspeed.get(i) - speed.get(i);
			}
			i++;
		}
		out.println(max);
		in.close();
		out.close();
	}
}
