class MaxSubArray {
    // brute: iterate each subarray and find sum ~o(n3)
    static void brute(int[] a, int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

    // better
    static void better(int[] a, int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

    // optimal
    static void optimal(int[] a, int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        brute(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }, 8);
        better(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }, 8);
        optimal(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }, 8);
    }
}
