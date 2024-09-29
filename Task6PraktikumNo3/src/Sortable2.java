public interface Sortable2 {
    int compare(Sortable2 b);
    public static void shell_sort(Sortable2[] a){
        int n = a.length;

        // Gap sequence
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable2 temp = a[i];

                int j;
                for (j = i; j >= gap && temp.compare(a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}