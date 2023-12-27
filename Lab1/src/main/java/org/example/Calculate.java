package org.example;

public class Calculate {

    public int calculateResult(int a, int b, int n, int m, int c) {
        if (a <= -c && -c <= n) {
            throw new IllegalArgumentException("Invalid values");
        }

        int result = 0;

        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                result += (i + j) / (i + c);
            }
        }

        return result;
    }
}
