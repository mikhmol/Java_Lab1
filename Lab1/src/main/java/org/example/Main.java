package org.example;

public class Main {
    public static void main(String[] args) {
        int studentId = 1318;

        int c2 = studentId % 2;
        int c3 = studentId % 3;
        int c5 = studentId % 5;
        int c7 = studentId % 7;

        char o1;
        if (c2 == 0) {
            o1 = '+';
        } else {
            o1 = '-';
        }

        int c = c3;

        char o2;
        switch (c5) {
            case 0:
                o2 = '*';
                break;
            case 1:
                o2 = '/';
                break;
            case 2:
                o2 = '%';
                break;
            case 3:
                o2 = '+';
                break;
            case 4:
                o2 = '-';
                break;
            default:
                o2 = '*';
        }

        String[] indexTypes = {"byte", "short", "int", "long", "char", "float", "double"};
        String indexType = indexTypes[c7];

        double result = calculateResult(o1, c, o2);

        System.out.println("Результат обчислень: " + result + " з типом індексів " + indexType);
    }

    private static double calculateResult(char o1, int c, char o2) {
        int n = 10;
        double result = 0.0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += performOperations(o1, c, o2, i, j);
            }
        }

        return result;
    }

    private static double performOperations(char o1, int c, char o2, int i, int j) {
        double result = 0.0;

        switch (o2) {
            case '*':
                result = o1 == '+' ? (i * j + c) : (i * j - c);
                break;
            case '/':
                result = o1 == '+' ? (i / (j + 1) + c) : (i / (j + 1) - c);
                break;
            case '%':
                result = o1 == '+' ? (i % (j + 1) + c) : (i % (j + 1) - c);
                break;
            case '+':
                result = o1 == '+' ? (i + j + c) : (i + j - c);
                break;
            case '-':
                result = o1 == '+' ? (i - j + c) : (i - j - c);
                break;
        }

        return result;
    }
}