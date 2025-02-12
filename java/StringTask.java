import java.util.Scanner;                                                                                                                                   
public class StringTask {                                                                                                                                   
    public static void main (String[] args) {                                                                                                               
        Scanner in = new Scanner(System.in);                                                                                                                
        String str = in.nextLine();                                                                                                                         
        String ret = "";                                                                                                                                    
        for (int i = 0; i < str.length(); i++){                                                                                                             
            String s = str.substring(i,i+1).toLowerCase();                                                                                                  
            if  (!(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")||s.equals("y"))) {                                             
                ret+="."+s;                                                                                                                                 
            }                                                                                                                                               
        }                                                                                                                                                   
        System.out.println(ret);                                                                                                                            
    }                                                                                                                                                       
}         
