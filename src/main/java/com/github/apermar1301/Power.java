package com.github.apermar1301;

public class Power extends Thread {

    private final int number;

    public Power(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d ^ %d = %d%n", number, i, (long) Math.pow(number, i));
        }
    }
}
