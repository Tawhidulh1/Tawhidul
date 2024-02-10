package Arrays.Strings;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] names = new String[10];
        names[0] = "Joe";
        names[1] = "Bob";
        names[2] = "Billy";
        names[3] = "Muhammad";
        names[4] = "Karen";
        names[5] = "James";
        names[6] = "Peter";
        names[7] = "Marc";
        names[8] = "Mark";
        names[9] = "Michael";

        String[] names2= names.clone();
        
        for (int i = 0; i < names.length; i = i + 1) {
            System.out.println("names: "+names[i]);
        }
        System.out.println();
        for (int i = names.length - 1; i >= 0; i = i - 1) {
            System.out.println("names2: "+names2[i]);
        }
    }
}
