import java.util.Scanner;
import java.lang.Math;
public class MaximumDistance {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] x = new int[in.nextInt()];
		int[] y = new int[x.length];
		for (int i = 0; i < x.length; i++){
			x[i] = in.nextInt();
		}
		for (int i = 0; i < x.length; i++){
			y[i] = in.nextInt();
		}
		in.close();
		int max = Integer.MIN_VALUE;
		for (int j = 0; j < x.length; j++){
			for (int i = 0; i < x.length; i++){	
				if (j == i){
					continue;
				}
				int x1 = x[j]; 
				int y1 = y[j]; 
				int x2 = x[i]; 
				int y2 = y[i]; 
				if (max < distance(x1,y1,x2,y2)){
					max = distance(x1,y1,x2,y2);
				}
			}	
		}	
		System.out.println(max);

	}
	static int distance (int x1, int y1, int x2, int y2){
		return (int)(Math.pow(x1-x2,2)) +(int)(Math.pow(y1-y2,2));
	}
}
