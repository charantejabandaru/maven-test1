package com.example.javamavenjunithelloworld;

public class utility {
    public static int charan(int num1, int num2) {
        return (num1 > num2)? num1 : num2;
    }
    public static void main(String[] args) {
        int largeNumber = charan(688, 686);
        System.out.println(largeNumber);
    }
}
