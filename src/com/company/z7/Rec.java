package com.company.z7;

public class Rec {
    public int rec(long x, long div, double val) {
        if (x == 1 || div > val) {
            return 0;
        }
        else {
            if (x % div == 0) {
                System.out.print(" * " + div);
                return rec(x / div, div, val);
            }
            else {
                return rec(x, div + 1, val);
            }
        }
    }
}
