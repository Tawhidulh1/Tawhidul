import java.util.Scanner;
public class Elephant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int steps = 0;
		while (X != 0){
			if(X - 5 >= 0){
				X-=5;
				steps++;
			}
			else if (X - 4 >= 0){
				X-=4;
				steps++;	
			}
			else if (X - 3 >= 0){
				X-=3;
				steps++;
			}
			else if (X - 2 >= 0){
				X-=2;
				steps++;
			}	
			else if (X - 1 >= 0) {
				X--;
				steps++;
			}
		}
		System.out.println(steps);
	}
}
