import java.util.Scanner;
public class ProblemAboutEquation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		double b = in.nextDouble();
		double[] a = new double[(int)(n)]; 
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++){
			a[i] = in.nextInt();
			max = Math.max(max,a[i]);
		}
		double[] temp = a;
		for (int i = 0; i < a.length; i++){
			int ctr = 0;
			while (temp[i] != max){
				ctr++;	
				temp[i]++;
				b--;
			}
			temp[i] = ctr;
		}
		for (int i = 0; i < a.length; i++){temp[i]+=b/n;}
		if (b < 0){
			System.out.println(-1);
		}
		else {
			for (int i = 0; i < n; i++){
				System.out.println(String.format("%.6f",temp[i]));
			}
		}
	}
}
