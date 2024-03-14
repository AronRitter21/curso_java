package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class exercicioAula64 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
    
        System.out.println("Digite as medidas do primeiro triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
    
        System.out.println("Digite as medidas do segundo triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.println("O valor da área do primeiro triangulo é: " + x.area());
        System.out.println("O valor da área do segundo triangulo é: " + y.area());
/* 
        if(areaX > areaY){
            System.out.println("A maior área é do primeiro triangulo.");
        }else{
            System.out.println("A maior área é do segundo triangulo.");
        }
        */
        sc.close();
    }
}
