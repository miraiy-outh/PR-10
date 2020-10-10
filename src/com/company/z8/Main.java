package com.company.z8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        char[] mas = x.toCharArray();
        int len = x.length() / 2;
        int size = x.length();
        int i = 0;
        Pol pol = new Pol();
        pol.poly(mas, len, size, i);
    }
}
