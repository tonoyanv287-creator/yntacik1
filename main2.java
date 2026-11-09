public class StatementsUtil {

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean isInRange(int x) {
        return (x > 5 && x < 8) || (x > 15 && x < 20);
    }

    public static boolean isDivisibleBy5And7(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    public static boolean isSecondDigitSeven(int x) {
        int secondDigit = (Math.abs(x) / 10) % 10;
        return secondDigit == 7;
    }

    public static boolean isInsideCircle(double x, double y) {
        return (x * x + y * y) <= 25;
    }

    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void print1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    public static void printFirstDigit(int x) {
        int temp = Math.abs(x);
        while (temp >= 10) {
            temp /= 10;
        }
        System.out.println("First digit: " + temp);
    }

    public static void runLoopExample() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println("x + y = " + (x + y));
            x++;
            y++;
        }
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < size; j++) {
                sb.append("* ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    public static int sumOfMultiplesOf5(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of multiples of 5 in [1, " + n + "] = " + sum);
        return sum;
    }

    public static long productOfTwoDigitEvenNumbers(int n) {
        long product = 1;
        boolean found = false;
        for (int i = 10; i <= n && i <= 99; i += 2) {
            product *= i;
            found = true;
        }
        if (!found) {
            product = 0;
        }
        System.out.println("Product of two-digit even numbers in [1, " + n + "] = " + product);
        return product;
    }

    public static double averageMinMax(int n) {
        if (n < 1) {
            System.out.println("Invalid N value.");
            return 0;
        }
        int min = 1;
        int max = n;
        double average = (min + max) / 2.0;
        System.out.println("Min: " + min + ", Max: " + max + ", Average: " + average);
        return average;
    }

    public static int sumOfDigits5Digit(int x) {
        int sum = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits for " + x + " = " + sum);
        return sum;
    }
}
