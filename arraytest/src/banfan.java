import java.util.Scanner;

public class banfan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }
            int[] sums = new int[n];
            sums[0] = prices[0];
            for (int i = 1; i < n; i++) {
                sums[i] = sums[i - 1] + prices[i];
            }
            for (int i = 0; i < m; i++) {
                int start = scanner.nextInt() - 1;
                int end = scanner.nextInt() - 1;
                System.out.println(sums[end] - sums[start] + prices[start]);
            }
        }
    }
}