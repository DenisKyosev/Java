package sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Sumator {

    Sumator() {
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static int sum(String a, String b) {
        int first = 0;
        int second = 0;
        try {
            first = Integer.parseInt(a);
            second = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println("There was a error: " + e.getMessage());
        }
        return first + second;
    }

    public static BigInteger sum(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    public static BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

}