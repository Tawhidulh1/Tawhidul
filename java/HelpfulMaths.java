import java.util.Scanner;
public class HelpfulMaths {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int one = 0;
        int two = 0;
        int three = 0; 
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i,i+1);
            if (c.equals("1")) {
                one++;
            } 
            else if (c.equals("2")) {
                two++;
            }
            else if (c.equals("3")) {
                three++;
            }
        }
        String ret = "";
        for (int i = 0; i < one; i++) {
           ret+="1"+"+";
        }
        for (int i = 0; i < two; i++) {
           ret+="2"+"+";
        }
        for (int i = 0; i < three; i++) {
           ret+="3"+"+";
        }
        ret = ret.substring(0,ret.length()-1);
        System.out.println(ret);
    }
}
