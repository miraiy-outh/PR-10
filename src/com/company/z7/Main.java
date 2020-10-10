package com.company.z7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextInt();
        long div = 2;
        double val = Math.sqrt(x);
        System.out.print(x +" = 1");
        Rec r = new Rec();
        r.rec(x, div, val);
    }
}
