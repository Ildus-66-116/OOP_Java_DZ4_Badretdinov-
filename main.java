package org.example.DZ4;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Calculator calcutalor = new Calculator();
        System.out.println(calcutalor.sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))));
        System.out.println("Умножение " + calcutalor.umn(new ArrayList<>(Arrays.asList(5, 6, 10))));
        System.out.println("Деление " + calcutalor.del(new ArrayList<>(Arrays.asList(10, 2, 2, 5))));
    }
}
