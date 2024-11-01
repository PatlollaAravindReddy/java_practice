package leetCode;

public class Pow_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }

    public static double myPow(double x, int n) {
        if(n < 0) {
            x = 1/x;
            n = -1 * n;
        }
        if(n == 1) {
            return x;
        }
        n = n - 1;
        return x * myPow(x, n);
    }
}
