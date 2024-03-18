package application;

import java.util.Scanner;
import entities.Rectangle;


public class GeneralAplications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeneralAplications generalAplications = new GeneralAplications();
        
        System.out.println("Qual a função de teste desejada? ");
        System.out.println("1 - Retângulo");
        switch (sc.nextInt()) {
            case 1:
                generalAplications.retangulo();
                break;
            default:
                break;
        }
        sc.close();
    }
    public void retangulo(){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Digite a largura do retângulo: ");
        rectangle.width = sc.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        rectangle.height = sc.nextDouble();
        
        System.out.println("Área: " + rectangle.Area());
        System.out.println("Perímetro: " + rectangle.Perimetro());
        System.out.println("Diagonal: " + rectangle.Diagonal());
        sc.close();
    }    
}
