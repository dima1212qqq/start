package ru.dovakun;

public class DZ2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (a > max) {
            max = a;
        } else if (a < min) {
            min = a;
        }
        if (b > max) {
            max = b;
        } else if (b < min) {
            min = b;
        }
        if (c > max) {
            max = c;
        } else if (c < min) {
            min = c;
        }
        for (int i = max; i > min; i--) {
            if (i != a && i != b && i != c) {
                System.out.println(i + " ");
            }
        }
    }

}
