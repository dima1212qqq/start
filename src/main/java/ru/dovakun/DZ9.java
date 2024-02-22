package ru.dovakun;

public class DZ9 {
    public static void main(String[] args) {
        int number = 795597;
        int a = number / 100000 % 10;
        int b = number / 10000 % 10;
        int c = number / 1000 % 10;
        int d = number / 100 % 10;
        int e = number / 10 % 10;
        int f = number % 10;
        int sum1 = a + b + c;
        int sum2 = d + e + f;
        boolean isLucky = sum1 == sum2;
        String result;
        if (isLucky){
            result = "является";
        }else {
            result = "не является";
        }
        System.out.printf("Число %d %s счастливым%n", number, result);
        System.out.printf("Сумма цифр %d%d%d = %d, а сумма %d%d%d = %d%n", a, b, c, sum1, d, e, f, sum2);
    }
}
