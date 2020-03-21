package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangulo R = new Rectangulo();
        R.setAltura(4);
        R.setBase(6);
        R.getAltura();
        R.getBase();
        R.area();
        R.perimetro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base nueva del rectangulo: ");
        double base = scanner.nextDouble();
        R.setBase(base);
        System.out.println("Ingrese la altura nueva del rectangulo: ");
        double altura = scanner.nextDouble();
        R.setAltura(altura);
        System.out.println("Area con nuevos valores: ");
        R.area();
        Rectangulo R1 = new Rectangulo();
        System.out.println(" \nRectangulo 1 : ");
        R1.getBase();
        R1.getAltura();
    }
}
