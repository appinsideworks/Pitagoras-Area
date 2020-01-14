package com.ramon.alvarez.pitagoras;

public class Area {

    public static double Cuadrado(double lado) {
        return lado * lado;
    }

    public static double Rectangulo(double base, double altura) {

        return base * altura;
    }

    public static double Triangulo(double base, double altura) {
        return ((base * altura) / 2);
    }

    public static double Rombo(double diagonaMayor, double diagonaMenor) {
        return diagonaMayor * diagonaMenor;
    }

    public static double Romboide(double base, double altura) {
        return base * altura;
    }

    public static double Trapecio(double altura, double baseMayor, double baseMenor) {
        return ((altura * (baseMayor * baseMenor)) / 2);
    }

    public static double Circulo(double radio) {
        double pi = 3.1416;

        return (pi * (radio * radio));
    }

}
