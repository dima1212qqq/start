package ru.dovakun;

public class DZ7 {
    public static void main(String[] args) {
        String[] columnNames = {"DECIMAL", "CHARACTER", "DESCRIPTION"};
        char[] characters = {'\u000F','\u0011','\u0013','\u0015','\u0016','\u0017','\u0019',};

        for (String columnName : columnNames) {
            System.out.printf("%-15s", columnName);
        }
        System.out.println();

        for (int i = 0; i < characters.length; i++) {
            System.out.printf("%-15d", (int)characters[i]);
            System.out.printf("%-15c", characters[i]);
            System.out.printf("%-15s", Character.getName(characters[i]));
            System.out.println();
        }
    }
}