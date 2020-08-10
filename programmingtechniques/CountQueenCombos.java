package programmingtechniques;

import java.util.ArrayList;
import java.util.Scanner;

public class CountQueenCombos {
    static int n;
    static int comboCount = 0;

    public static void main(String[] args) {
        // calculate number of ways n queens can be placed on nxn chessboard
        // so that no queens can attack each other
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        search(0);

        in.close();
    }

    static void search(int k) {
        if (k == n) {
            // if all n queens have been placed, one solution has been found
            comboCount++;
        } else {
            // UNIMPLEMENTED
        }
    }
}
