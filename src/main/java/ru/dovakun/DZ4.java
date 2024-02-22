package ru.dovakun;

public class DZ4 {
    public static void main(String[] args) {
        int start = 1;
        int end = 24;
        int line = 5;

        for (int i = start; i < end; i += line) {
            for (int j = 0; j < line; j++) {
                if (i + j < end) {
                    System.out.printf("%5d", i + j);
                } else {
                    System.out.printf("%5d", 0);
                }
            }
            System.out.println();
        }
    }
}
