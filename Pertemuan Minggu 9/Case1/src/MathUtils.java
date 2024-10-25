public class MathUtils {
    // Menghitung faktorial dengan penanganan pengecualian
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: Factorial valid untuk bilangan integer negatif.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Error: factorial dengan bilangan lebih dari 16 menyebabkan overflow.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
