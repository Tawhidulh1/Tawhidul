import java.util.Scanner;
public class PhoneNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine(); 
        
        int ctr8 = 0;
        for (int i = 0; i < str.length(); i++){
            String c = str.substring(i,i+1);
            if (c.equals("8")){
                ctr8++;
            }
        }
        if (ctr8 >= n/11){
            System.out.println(n/11);
        }
        else if (ctr8 < n/11){
            System.out.println(ctr8);
        }
        else {
            System.out.println("0");
        }
    }
}
