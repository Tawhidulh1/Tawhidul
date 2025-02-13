import java.util.Scanner;
import java.util.Arrays;
public class KevinAndArithemic {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();	
			int[] a = new int[n];
			int e = 0;
			int o = 0;
			for (int i= 0; i < n; i++){a[i]=in.nextInt(); if (a[i] % 2 == 0){e++;}else {o++;}}
			if (e != 0){
				System.out.println(o+1);
			}
			else {
				System.out.println(o-1);
			}
		}
	}
}
