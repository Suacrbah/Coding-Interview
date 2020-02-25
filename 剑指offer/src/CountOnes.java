public class CountOnes {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));
        System.out.println(NumberOf1(9));
    }

    public static int NumberOf1(int n) {
        int ans = 0;
        int test = 1;

        for (int i = 0; i < 32; i++) {
            if ((test & n) != 0)
                ans++;
            test <<= 1;
        }

        return ans;
    }
}