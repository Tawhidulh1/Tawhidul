import java.io.*;
public class CircularBarn {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("cbarn.in"));			
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cbarn.out")));	
		int N = Integer.parseInt(in.readLine());
		int[] door = new int[N];
		while (in.ready()){
			for (int i = 0; i < N; i++){
				door[i] = Integer.parseInt(in.readLine());
			}
		}
	}
}
