package prog03;

public class LinearFib extends Fib{
    @Override
    public double fib(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++){
            c = a + b;
            b = c;
        }
        return a;
    }

    @Override
    public double O(int n) {
        return n;
    }
}
