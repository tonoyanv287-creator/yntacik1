public class Variables {
    public static void printBytes() {
        byte a = 10, b = 20;
        System.out.println(a + " " + b);
    }

    public static void printShorts() {
        short c = 1000, d = 2000;
        System.out.println(c + " " + d);
    }

    public static void printInts() {
        int e = 50000, f = 100000;
        System.out.println(e + " " + f);
    }

    public static void printLongs() {
        long g = 5000000000L, h = 9000000000L;
        System.out.println(g + " " + h);
    }

    public static void printIntMinMax() {
        System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);
    }

    public static void printByteAndInt() {
        byte b1 = 5;
        int i1 = 500;
        System.out.println(b1 + "\n" + i1);
    }
    public static void printFloats() { float j = 10.5f, k = 20.5f; System.out.println(j + " " + k); }
    public static void printDoubles() {
        double l = 100.123, m = 200.456;
        System.out.println(l + " " + m);
    }

    public static void printFloatMinMax() {
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

    public static void printFloatDoubleVals() {
        double n1 = 34.567839023, n2 = 12.345, n3 = 8923.1234857, n4 = 3456.091;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
    public static void printChars() { char n = 'A', o = 'B'; System.out.println(n); System.out.println(o); }
    public static void printCharCodes() {
        char s = 77, w = 109;
        System.out.println(s);
        System.out.println(w);
    }

    public static void printK() {
        char k1 = 'K', k2 = 75, k3 = '\u004B';
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }

    public static void printBooleans() {
        boolean p = true, q = false;
        System.out.println(p);
        System.out.println(q);
    }

    public static void printYear() {
        int year = 2011;
        System.out.print(year);
    }

    public static void main(String[] args) {
        printBytes();
        printShorts();
        printInts();
        printLongs();
        printIntMinMax();
        printByteAndInt();
        printFloats();
        printDoubles();
        printFloatMinMax();
        printFloatDoubleVals();
        printChars();
        printCharCodes();
        printK();
        printBooleans();
        printYear();
    }
}
