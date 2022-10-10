package ru.job4j.calculator;

public class TypeCasting {
    public static void main(String[] args) {
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println(l);
        System.out.println(b);
        // 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(f);
        System.out.println(i);
        System.out.println(rsl);
        // 3 выражение
        char c = 45000;
        float ii = c;
        System.out.println(c);
        System.out.println(ii);
        // 4 выражение
        double d = 121.19;
        byte bb = (byte) d;
        System.out.println(d);
        System.out.println(bb);
        // 5 выражение
        short s = 1500;
        char cc = (char) s;
        double dd = cc;
        System.out.println(cc);
        System.out.println(dd);
    }
}

