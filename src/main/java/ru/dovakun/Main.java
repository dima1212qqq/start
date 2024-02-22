package ru.dovakun;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int finish = 21;
        int even = 0;
        int odd = 0;
        int n = start;
        do {
            if (n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
            n++;
        } while (n <= finish);
        System.out.println(String.format("В отрезке сумма четных чисел ровна %d" +
                ", а сумма не четных ровна %d", even, odd));
        System.out.println();

        System.out.println("2. Вывод чисел в порядке убывания");
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
        System.out.println();

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        n = 1234;
        int reverse = 0;
        int sumN = 0;
        while (n > 0) {
            a = n % 10;
            sumN += a;
            reverse = reverse * 10 + a;
            n /= 10;
        }
        System.out.println(reverse + " Реверз " + sumN + " Сумма числе");
        System.out.println();

        System.out.println("4. Вывод чисел в несколько строк");
        start = 1;
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
        System.out.println();

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int number = 32425922;
        int originalNumber = number;
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

        System.out.printf("В %d %s количество двоек — %d",originalNumber, parity, count2);
        System.out.println();

        System.out.println("6. Отображение геометрических фигур");
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
        System.out.println();

        System.out.println("7. Отображение ASCII-символов");
        String[] columnNames = {"DECIMAL", "CHARACTER", "DESCRIPTION"};
        char[] characters = {'\u000F','\u0011','\u0013','\u0015','\u0016','\u0017','\u0019',};

        for (String columnName : columnNames) {
            System.out.printf("%-15s", columnName);
        }
        System.out.println();

        for (i = 0; i < characters.length; i++) {
            System.out.printf("%-15d", (int)characters[i]);
            System.out.printf("%-15c", characters[i]);
            System.out.printf("%-15s", Character.getName(characters[i]));
            System.out.println();
        }
        System.out.println();

        System.out.println("8. Проверка, является ли число палиндромом");
        number = 12344321;
        originalNumber = number;
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
        System.out.println();

        System.out.println("9. Проверка, является ли число счастливым");
        number = 795597;
        a = number / 100000 % 10;
        b = number / 10000 % 10;
        c = number / 1000 % 10;
        int d = number / 100 % 10;
        int e = number / 10 % 10;
        int f = number % 10;
        int sum1 = a + b + c;
        int sum2 = d + e + f;
        boolean isLucky = sum1 == sum2;
        if (isLucky){
            result = "является";
        }else {
            result = "не является";
        }
        System.out.printf("Число %d %s счастливым%n", number, result);
        System.out.printf("Сумма цифр %d%d%d = %d, а сумма %d%d%d = %d%n", a, b, c, sum1, d, e, f, sum2);
        System.out.println();

        System.out.println("10. Отображение таблицы умножения Пифагора");
        System.out.printf("%3s |", "");
        for (i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        for (i = 1; i <= 10; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}