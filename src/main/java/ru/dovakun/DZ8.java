package ru.dovakun;

public class DZ8 {
    public static void main(String[] args) {
        int number = 12344321;
        int originalNumber = number;
        int reverseNumber = 0;
        String result;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        boolean isPalindrome = originalNumber == reverseNumber;
        if (isPalindrome){
            result = "является";
        }else {
            result = "не является";
        }
        System.out.printf("Число %d %s палиндромом%n", originalNumber, result);
    }
}

