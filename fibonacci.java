import java.util.ArrayList;
import java.util.List;

public class PrimeFibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacciNumbers = generateFibonacciNumbers(100000);
        List<Integer> primeNumbers = generatePrimeNumbers(100000);

        List<Integer> primeFibonacciNumbers = findCommonElements(fibonacciNumbers, primeNumbers);

        System.out.println("Prime Fibonacci numbers below 100,000:");
        for (int number : primeFibonacciNumbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> generateFibonacciNumbers(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);

        int currentIndex = 2;
        while (fibonacciNumbers.get(currentIndex - 1) < limit) {
            int nextFibonacci = fibonacciNumbers.get(currentIndex - 1) + fibonacciNumbers.get(currentIndex - 2);
            fibonacciNumbers.add(nextFibonacci);
            currentIndex++;
        }

        return fibonacciNumbers;
    }

    private static List<Integer> generatePrimeNumbers(int limit) {
        List<Integer> primeNumbers = new ArrayList<>();
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    private static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        for (int element : list1) {
            if (list2.contains(element)) {
                commonElements.add(element);
            }
        }
        return commonElements;
    }
}
