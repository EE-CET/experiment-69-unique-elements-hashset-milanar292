import java.util.*;

public class UniqueElementsHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N
        int N = sc.nextInt();

        // Create HashSet to store unique numbers
        HashSet<Integer> set = new HashSet<>();

        // Read N integers and add to HashSet
        for(int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        // Print unique elements
        for(int num : set) {
            System.out.print(num + " ");
        }
    }
}
