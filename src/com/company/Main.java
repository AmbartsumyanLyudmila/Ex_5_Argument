package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = enter.nextInt();
        System.out.println("Введите второе число");
        int y = enter.nextInt();
        System.out.println("X+Y=" + (x + y));
        System.out.println("X*Y= " + (x * y));
        int sum = 0;
        int proiz = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++) {
            proiz *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма args[i]= " + sum);
        System.out.println("Произведение args[i]= " + proiz);

    }

}
