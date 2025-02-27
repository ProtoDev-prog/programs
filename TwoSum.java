import java.util.HashMap;

public class TwoSum {
    // brute
    static void brute(int[] a, int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    // better
    static void better(int[] a, int n, int target) {
        HashMap<Integer, Integer> obj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int more = target - a[i];
            if (obj.containsKey(more)) {
                System.out.println(obj.get(more) + " " + i);
                break;
            }
            obj.put(a[i], i);
        }
    }

    // optimal
    static void optimal(int[] a, int n, int target) {
        int right = n - 1;
        int left = 0;
        int sum = 0;
        while (left <= right) {
            sum = a[left] + a[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                System.out.println(left + " " + right);
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        brute(new int[] { 2, 3, 5, 7, 11 }, 5, 8);
        better(new int[] { 2, 3, 5, 7, 11 }, 5, 8);
        optimal(new int[] { 2, 3, 5, 7, 11 }, 5, 8);
    }
}
