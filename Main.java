package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi,a,b,c,top=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Üç basamaklı sayı giriniz: ");
        sayi = input.nextInt();

        a = sayi/100;
        b = sayi/10%10;
        c = sayi%10;

        top = a+b+c;
        System.out.println(top);
    }
}
