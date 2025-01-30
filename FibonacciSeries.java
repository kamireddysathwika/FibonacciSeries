public class FibonacciSeries {

    public static void main(String[] args) {
        // Set the number of terms for Fibonacci series
        int n = 10; // Example: Fibonacci series up to 10 terms

        // Call the function to print Fibonacci series
        printFibonacci(n);
    }

    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 10;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to generate Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm + " ");

            // Update the terms for next iteration
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
