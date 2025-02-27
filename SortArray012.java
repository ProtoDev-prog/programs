import java.util.Arrays;

class SortArray012 {
    // Brute: Using any Sorting algo
    static void brute(int[] a, int n) {
        Arrays.sort(a);
        for (int ele : a) {
            System.out.print(ele + "|");
        }
        System.out.println();
    }

    // Better: Using variable counter
    static void better(int[] a, int n) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                c0++;
            else if (a[i] == 1)
                c1++;
            else
                c2++;
        }
        for (int i = 0; i < c0; i++) {
            a[i] = 0;
        }
        for (int i = c0; i < c0 + c1; i++) {
            a[i] = 1;
        }
        for (int i = c2 + 1; i < n; i++) {
            a[i] = 2;
        }
        for (int ele : a) {
            System.out.print(ele + "|");
        }
        System.out.println();
    }

    // Optimal: Using Dutch National Flag Algo
    static void optimal(int[] a, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                mid++;
                low++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
        for (int ele : a) {
            System.out.print(ele + "|");
        }
    }

    public static void main(String[] args) {
        brute(new int[] { 0, 1, 2, 0, 2, 2, 1 }, 7);
        better(new int[] { 0, 1, 2, 0, 2, 2, 1 }, 7);
        optimal(new int[] { 0, 1, 2, 0, 2, 2, 1 }, 7);
    }
}
