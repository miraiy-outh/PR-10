package com.company.z9;

public class Count {
    public int count(int a, int b) {
        if ( a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return count(a, b - 1) + count(a - 1, b - 1);
    }
}
