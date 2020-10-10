package com.company.z9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        Count cnt = new Count();
        System.out.println(cnt.count(a, b));
    }
}
