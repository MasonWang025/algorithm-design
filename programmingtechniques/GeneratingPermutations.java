package programmingtechniques;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneratingPermutations {
    private static int n;
    private static ArrayList<Integer> permutation = new ArrayList<>();
    private static boolean[] chosen;

    public static void main(String[] args) {
        // generate all subsets of n elements
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        chosen = new boolean[n + 1];
        search();

        in.close();
    }

    private static void search() {
        // DFS; each call appends to permutation and marks as chosen
        if (permutation.size() == n) {
            // permutation has been created
            System.out.print("Permutation created: ");
            for (Integer i : permutation)
                System.out.print(i);
            System.out.println();
        } else {
            // append to permutation and mark chosen
            for (int i = 0; i < n; i++) {
                if (chosen[i]) continue;
                // add to permutation and continue down branch
                permutation.add(i + 1);
                chosen[i] = true;
                search();
                // don't keep in permutation
                permutation.remove(permutation.size() - 1);
                chosen[i] = false;
            }
        }
    }
}
