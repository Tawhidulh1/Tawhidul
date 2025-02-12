import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class UnitedWeStand {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc<t; tc++){
			ArrayList<Integer> b = new ArrayList<Integer>();
			ArrayList<Integer> c = new ArrayList<Integer>();
			int n = in.nextInt();
			int[] a = new int[n];
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++){a[i] = in.nextInt(); if (a[i] < min){min=a[i];}}
			for (int i = 0; i < n; i++){
				if (a[i] == min){
					b.add(a[i]);
				}
				else {
					c.add(a[i]);
				}
			}
			if (b.size() == 0 || c.size() == 0){
				System.out.println(-1);
			}
			else {
				System.out.println(b.size()+" "+c.size());
				System.out.println(Arrays.toString(b.toArray()).replace("[","").replace("]","").replace(",",""));
				System.out.println(Arrays.toString(c.toArray()).replace("[","").replace("]","").replace(",",""));
			}
			
		}
	}
}
