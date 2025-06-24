package practice;

public class NaturalNum {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // add i instead of 1
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
