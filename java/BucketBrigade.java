import java.io.*;
public class BucketBrigade {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("buckets.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out")));
		int lociB = -1;
		int lociL = -1;
		int lociR = -1;
		int locR =  -1;
		int locL =  -1;
		int locB =  -1;
		while (in.ready()){
			String[] grid = new String[10];
			for (int i = 0; i < 10; i++){
				grid[i] = in.readLine();
				if (grid[i].indexOf("B") != -1){
					lociB = i;
					locB = grid[i].indexOf("B");
				}
				if (grid[i].indexOf("L") != -1){
					lociL = i;
					locL = grid[i].indexOf("L");
				}
				if (grid[i].indexOf("R") != -1){
					lociR = i;
					locR = grid[i].indexOf("R");
				}

			}
		}
		int cows = Math.abs(lociL-lociB)+Math.abs(locL-locB)-1;
		if (lociB==lociR&&lociB==lociL&&
				((locR < locL && locR > locB) || 
				(locR > locL && locR < locB))){
			cows+=2;
		}	
		if (locR == locB && locR == locL&&
				((lociR<lociL&&lociR>lociB)||
				 (lociR>lociL&&lociR<lociB))){
			cows+=2;
		}
		out.println(cows);		
		out.close();
		in.close();
	}
}
