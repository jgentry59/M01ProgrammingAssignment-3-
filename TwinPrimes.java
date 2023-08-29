public class TwinPrimes {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static int[][] findTwinPrimes(int limit) {
        int[][] twinPrimes = new int[limit][2];
        int count = 0;
        for (int num = 3; num + 2 < limit; num++) {
            if (isPrime(num) && isPrime(num + 2)) {
                twinPrimes[count++] = new int[] { num, num + 2 };
            }
        }
        return java.util.Arrays.copyOfRange(twinPrimes, 0, count);
    }
    public static void displayTwinPrimes(int[][] twinPrimes) {
        for (int[] twinPrime : twinPrimes) {
            System.out.println("(" + twinPrime[0] + ", " + twinPrime[1] + ")");
        }
    }
    public static void main(String[] args) {
        int limit = 1000;
        int[][] twinPrimes = findTwinPrimes(limit);
        displayTwinPrimes(twinPrimes);
    }
}