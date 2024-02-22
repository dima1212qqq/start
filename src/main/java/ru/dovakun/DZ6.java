package ru.dovakun;

public class DZ6 {
    public static void main(String[] args) {
        //Только for
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Только while
        int rows = 5;
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        //только do while

    }
}
