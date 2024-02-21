package ru.dovakun;

public class DZ3 {
    public static void main(String[] args) {
        int n = 1234;
        int reverse = 0;
        int sumN = 0;
        while (n>0){
            int a = n%10;
            sumN+=a;
            reverse=reverse*10+a;
            n/=10;
        }
        System.out.println(reverse + " Реверз "+ sumN + " Сумма числе");
    }
}
