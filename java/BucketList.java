import java.io.*;
import java.util.StringTokenizer;
public class BucketList{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("blist.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
		int N = Integer.parseInt(in.readLine());
		int[][] cow = new int[N][3];
		int time = Integer.MIN_VALUE;
		int start = Integer.MAX_VALUE;
		while(in.ready()){
			
			for (int i = 0; i < N; i++){
				StringTokenizer st = new StringTokenizer(in.readLine());
				cow[i][0] = Integer.parseInt(st.nextToken());
				cow[i][1] = Integer.parseInt(st.nextToken());
				cow[i][2] = Integer.parseInt(st.nextToken());
				if (cow[i][1] > time){
					time = cow[i][1];
				}
				if (cow[i][0] < start){
					start = cow[i][0];
				}
			}
		}
		int max = Integer.MIN_VALUE;
		int buckets = 0;
		for (int ti = start; ti <= time; ti++){
			for (int i = 0; i < N; i++){
				if (cow[i][0] == ti){
					buckets+=cow[i][2];	
				}
				else if (cow[i][1] == ti){
					buckets-=cow[i][2];
				}
				if (max < buckets){
					max = buckets;
				}
			}
		}
		out.println(max);
		out.close();
		in.close();
	}
}
