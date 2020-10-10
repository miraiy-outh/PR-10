package com.company.z8;

public class Pol {
    public int poly(char[] mas, int len, int size, int i) {
        if (i >= len) {
            System.out.println("YES");
            return 0;
        }
        else {
            if (mas[i] == mas[size - i - 1]) {
                return poly(mas, len, size,i + 1);
            }
            else {
                System.out.println("NO");
                return 0;
            }
        }
    }
}
