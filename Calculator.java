package org.example.DZ4;

import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }
    public Double umn(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return  result;
    }
    public Double del(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) result = result / list.get(i).doubleValue();
        return  result;
    }
    public  Integer binar(int n) {
        String binary = Integer.toBinaryString(n);
        return Integer.valueOf(binary);
    }
}
