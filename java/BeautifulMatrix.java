import java.util.Scanner;
public class BeautifulMatrix {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int ret = 0;
		for (int i = 0; i < 25; i++){
			int x = in.nextInt(); 
			if (x==1){
				ret = Math.abs(12-i);
			}
		}
		System.out.println(ret);
	}
}
