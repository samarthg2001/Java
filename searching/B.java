import java.util.ArrayList;

public class B {
    public static void main(String[] args) {

        int[] a = {10, 2, 3, 5, 6, 4, 5, 5, 4};
        int n = a.length;

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j]) {

                    if (!duplicates.contains(a[i])) {
                        duplicates.add(a[i]);
                    }
                }
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
