package ru.dovakun;

public class DZ5 {
    public static void main(String[] args) {
        int number = 32425922;
        int count2 = 0;


        while (number > 0) {
            int digit = number % 10;
            if (digit == 2) {
                count2++;
            }
            number = number/ 10;
        }


        String parity;
        if (count2 % 2 == 0) {
            parity = "четное";
        } else {
            parity = "не четное";
        }

        System.out.printf("В 3242592 %s количество двоек — %d", parity, count2);
    }
}

