public class Factorial {
    public float calculateFactorialOf(int n) {
        float result = n;
        for (int i = n-1; i >= 1; i--)
            result = result * i;
        return result;
    }

    public float calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n-1);
        }
    }
}
