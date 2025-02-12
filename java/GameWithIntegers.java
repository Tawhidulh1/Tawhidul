import java.util.Scanner;
public class GameWithIntegers {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		// 3
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			boolean won = false;
			int round = 0;
			while (round < 10){
				if (round % 2 == 0){
					if (n % 3 == 0){
						n++;
					}
					else if (n % 3 == 1){
						n--;
					}
					else if (n % 3 == 2){
						n++;
					}
				}
				if (round % 2 == 1){
					if (n % 3 == 0){
						won = true;
					}
					else if (n % 3 == 1){
						n--;
					}
					else if (n % 3 == 2){
						n++;
					}
				}
				round++;
			}
			if (won){
				System.out.println("First");
			}
			else {
				System.out.println("Second");
			}
		}
	}
}
