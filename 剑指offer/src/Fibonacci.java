public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++)
            System.out.println(getFibonacci(i));
    }

    public static int getFibonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int f1 = 1, f2 = 1;
        int f3 = 2, i = 3;

        while (i <= n) {
            f3 = f1 + f2;
            f1 = f2; f2 = f3;
            i++;
        }
        return f3;
    }
}