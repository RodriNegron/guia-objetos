package com.company;

public class Rectangulo {

    private double base = 1.0;
    private double altura = 1.0;


    public void getBase() {
        System.out.println("Base: " + this.base);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void getAltura() {

        System.out.println("Altura: " + this.altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void area() {
        double v;
        v = this.altura * this.base;
        System.out.println("Area: " + v);
    }
    public void perimetro () {
        double v;
        v = (2*this.altura) + (2*this.base);
        System.out.println("Perimetro: " + v);
    }

}
