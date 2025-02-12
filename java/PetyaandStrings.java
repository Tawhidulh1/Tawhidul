import java.util.Scanner;
public class PetyaandStrings {
    public static void main(String[] args) {
       Scanner in = new Scanner( System.in );
        String a = in.nextLine();
        String b = in.nextLine();
        int O = 0;
        for (int i = 0; i < a.length(); i++) {
            String A = a.substring(i,i+1).toLowerCase();
            String B = b.substring(i,i+1).toLowerCase();
            O = A.compareTo(B);
            if (O != 0){
                break;
            }
        }
        if (O < 0) {
            System.out.println("-1");
        }
        else if (O > 0) {
            System.out.println("1");
        } 
        else {
            System.out.println("0");
        }
    }
}
