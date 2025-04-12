package org.example.miaop2;

public class Pixel {
    private int red;
    public int green;
    private int blue;

    // Конструктор
    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Геттер и сеттер для red
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    // Геттер и сеттер для green (поле public, но можно добавить для удобства)
    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    // Геттер и сеттер для blue
    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}

