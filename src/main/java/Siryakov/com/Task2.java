package Siryakov.com;
public class Task2 { //менят местами значения переменных a и b, не используя 3й переменной.
    public static void main(String[] args) {
        int a=5, b=7;
        a +=b;
        b= a-b;
        a -=b;
        System.out.println("a = " + a + " b = " + b);
    }
}


