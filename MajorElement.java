import java.util.HashMap;

class MajorElement {
    // brute
    static void brute(int[] a, int n) {
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                System.out.println(a[i]);
                break;
            }
        }
    }

    // better->Some times Doesnot work Properly
    static void better(int[] a, int n) {
        HashMap<Integer, Integer> obj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (obj.containsKey(a[i])) {
                obj.put(a[i], obj.get(a[i]) + 1);
            } else {
                obj.put(a[i], 1);
            }
        }
        for (int key : obj.keySet()) {
            if (obj.get(key) > (n / 2)) {
                System.out.println(obj.get(key));
                break;
            }
            // System.out.println(obj.get(key));
        }
    }

    // optimal : moore voting algorithm
    static void optimal(int[] a, int n) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = a[i];
                count++;
            } else if (ele == a[i]) {
                count++;
            } else {
                count--;
            }
        }
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (ele == a[i]) {
                c1++;
            }
        }
        if (c1 > (n / 2))
            System.out.println(ele);
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        brute(new int[] { 2, 2, 3, 3, 2, 2 }, 6);
        better(new int[] { 2, 2, 3, 3, 2, 2 }, 6);
        optimal(new int[] { 2, 2, 3, 3, 2, 2 }, 6);
    }
}
