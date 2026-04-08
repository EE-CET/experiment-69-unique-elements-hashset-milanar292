import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Use LinkedHashSet to keep input order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        // Print unique elements
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
