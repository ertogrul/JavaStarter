package com.example.helloworld2;

public class MySwitch {
    public static void main(String[] args) {
        char penaltyKick = 'A';
        switch (penaltyKick) {
            case 'L': System.out.println("Messi shoots to the left and scores!");
                break;
            case 'R': System.out.println("Messi shoots to the right and misses the goal!");
                break;
            case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
                break;
            default:
                System.out.println("aaaaaaaaaah");
        }
    }
}