package Siryakov.com;

import java.util.Scanner;

public class Task4 { //Проверка на палиндром



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предполагаемый палиндром: ");
        String inputText = scanner.nextLine();
        System.out.println(CheckingForPalindrome(inputText));


    }
    public static boolean CheckingForPalindrome(String SuspectedPalindrome) {
        int length = SuspectedPalindrome.length();
        for (int i = 0; i < length / 2; ++i) {
            if (SuspectedPalindrome.charAt(i) != SuspectedPalindrome.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
