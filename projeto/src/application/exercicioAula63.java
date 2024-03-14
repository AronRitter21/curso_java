package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * exercicioAula63
 */
public class exercicioAula63 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do primeiro triangulo: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
    
        System.out.println("Digite as medidas do segundo triangulo: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
    
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY =  Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.println("O valor da área do primeiro triangulo é: " + areaX);
        System.out.println("O valor da área do segundo triangulo é: " + areaY);

        if(areaX > areaY){
            System.out.println("A maior área é do primeiro triangulo.");
        }else{
            System.out.println("A maior área é do segundo triangulo.");
        }

        sc.close();
    }
}