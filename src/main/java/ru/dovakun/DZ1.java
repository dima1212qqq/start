package ru.dovakun;

public class DZ1 {
    public static void main(String[] args) {
        int start = -10;
        int finish = 21;
        int even=0;
        int odd=0;
        int n = start;
        do {
            if (n%2==0){
                even+=n;
            }else {
                odd+=n;
            }
            n++;
        }while (n<=finish);
            System.out.println(String.format("В отрезке сумма четных чисел ровна %d" +
                    ", а сумма не четных ровна %d",even,odd));
    }
}
