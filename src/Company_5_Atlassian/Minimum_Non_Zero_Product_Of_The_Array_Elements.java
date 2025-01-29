package Company_5_Atlassian;

public class Minimum_Non_Zero_Product_Of_The_Array_Elements {
    static int modulo = 1000000007;
    public int minNonZeroProduct(int p) {
        long max = (long) Math.pow(2, p) - 1;
        long lastPrev = (long) max - 1;
        long mul = (long) lastPrev / 2;
        long temp = (long) power(lastPrev, mul);
        long result = (long) ((temp % modulo * (max % modulo)) % modulo);
        return (int) result;
    }
    static long power(long x, long y){
        if(y == 0){
            return 1;
        }
        long half = (long) power(x, y / 2);
        half =(half) % modulo;
        if(y % 2 == 0){
            return (half * half) % modulo;
        } else {
            return ((half * half) % modulo * (x % modulo)) % modulo;
        }
    }
}
