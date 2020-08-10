package programmingtechniques;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneratingSubsets {
    static int n;
    static ArrayList<Integer> subset = new ArrayList<>();

    public static void main(String[] args) {
        // generate all subsets of n elements
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        search(1);

        in.close();
    }

    static void search(int k) {
        // DFS until k > n, include k in one search call, don't include in next
        if (k > n) {
            // subset has been created
            System.out.print("Subset created: ");
            for (Integer i : subset)
                System.out.print(i);
            System.out.println();
        } else {
            // include k in search call
            subset.add(k);
            search(k + 1);
            // pop and call search without k
            subset.remove(subset.size() - 1);
            search(k + 1);
        }
    }
}