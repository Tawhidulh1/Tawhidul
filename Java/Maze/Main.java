//Project 01
//Not really a Maze, map generation is bad.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1:1 ratio otherwise error
        String[][] a = new String[11][11];
        int px = 0;
        int py = 0;
        boolean apl = true;
        boolean game = true;
        boolean answered = false;
        boolean spaceForward = false;
        boolean spaceLeft = false;
        boolean spaceRight = false;
        boolean spaceBackward = false;

        // Generate Map
        for(int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] == a[0][i] 
                 || a[j][i] == a[j][0]) {
                    a[j][i] = "X";                  
                }
                else {a[j][i] = "O";}

                if (a[j][i] == a[a.length - 1][a.length - 1]) {a[a.length - 1][a.length - 1] = "X";}
                else if (a[j][i] == a[j][a.length - 1]) {a[j][a.length - 1] = "X";}
                else if (a[j][i] == a[a.length - 1][i]) {a[a.length - 1][i] = "X";}

                if (a[j][i] == a[a.length / 3][a.length / 2 + 1]) {a[a.length / 2][a.length / 2 + 4] = "P";px=j;py=i;}

                int num = (int)(Math.random()*8)+1;
                if (num == 8 || num == 6 || num == 4 
                 && a[j][i] != "P") {
                    a[j][i] = "X";
                }
                else if (apl && a[j][i] != "X" ) {
                    a[j][i] = "W";
                    wx = j;
                    wy = i;
                    apl = false;
                }
            }
        }


        System.out.println();
        
        while (game) {
            while (!answered) {
                for (int i = 0; i < a.length; i++) {
                    System.out.println();
                    for (int j = 0; j < a.length; j++) {
                        System.out.print(a[j][i]+" ");
                    }
                }
                System.out.print("Move with W A S D type Q to quit > ");

                // Check for Tiles

                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        switch (a[j][i]){
                            case "P": px = j; py = i;
                        }
                    }
                }

                // Check for Empty Spaces

                if (!(a[px][py - 1] == "X")) {spaceForward = true;} else{spaceForward = false;}
                if (!(a[px][py + 1] == "X")) {spaceBackward = true;} else{spaceBackward = false;}
                if (!(a[px - 1][py] == "X")) {spaceLeft = true;}
                else {spaceLeft = false;}
                if (!(a[px + 1][py] == "X")) {spaceRight = true;} else{spaceRight = false;}




                // Check inputs

                String move = in.nextLine();
                switch (move.toLowerCase()) {
                    case "w": if(spaceForward) {a[px][py] = "O";a[px][py - 1] = "\u001B[31m"+"P"+"\u001B[0m";py -= 1;}
                    break;
                    case "s": if(spaceBackward) {a[px][py] = "O";a[px][py + 1] = "\u001B[34m"+"P"+"\u001B[0m";py += 1;}
                    break;
                    case "a": if(spaceLeft) {a[px][py] = "O";a[px - 1][py] = "\u001B[33m"+"P"+"\u001B[0m";px -= 1;}
                    break;
                    case "d": if(spaceRight) {a[px][py] = "O";a[px + 1][py] = "\u001B[35m"+"P"+"\u001B[0m";px += 1;}
                    break;
                    case "q": game = false;
                }
                answered = true;

            }
            // for (int i = 0; i < a.length; i++) {
            //     System.out.println();
            //     for (int j = 0; j < a.length; j++) {
            //         System.out.print(a[j][i]+" ");
            //     }
            // }         
            answered = false;
        }
    }
}
