public class Factorial {

    public static Long pureRecursive(int n){
        long result; // returnable variable

        if (n == 1){
            result = 1; // base case
        }
        else if(n <= 0){
            throw new IllegalArgumentException("n must be positive");
        }
        else {   // recursive case
            result = n * pureRecursive(n-1);
        }
        return result;
    }

    public static Long tailRecursive(int n){
        if(n <= 0){     // throws exception
            throw new IllegalArgumentException("n must be positive");
        }
        else{
            return tail(n, 1); // only method call within tailRecursive method, replacing stack call every time
        }
    }

    private static Long tail(long n, long running) {
        if (n <= 1) {
            return running; // base case
        } else {
            return tail(n - 1, running * n); // keeps a running total
        }
    }

    public static Long iterative(int n){
        long running = 1;

        if(n == 1){
            return running; // "base case"
        }
        if(n <= 0){
            throw new IllegalArgumentException("n must be positive");
        }
        else {
            while(n > 0){ // loop that multiplies n by n-1 until n = 1
                running *= n;
                n -= 1;
            }
        }

        return running;
    }













}

