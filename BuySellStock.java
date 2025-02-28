class BuySellStock {
    // brute && better && optimal
    static void optimal(int[] a) {
        int min = a[0];
        int maxProfit = 0;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int cost = a[i] - min;
            maxProfit = Math.max(maxProfit, cost);
            min = Math.min(min, a[i]);
        }
        System.out.print(maxProfit + " " + min);
    }

    public static void main(String[] args) {
        optimal(new int[] { 2, 1, 5, 7, 6 });
    }
}
