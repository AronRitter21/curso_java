package application;

import java.util.Scanner;
import entities.Rectangle;
import util.CurrencyConvertor;


public class GeneralAplications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeneralAplications generalAplications = new GeneralAplications();
        
        System.out.println("Qual a função de teste desejada? ");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Conversão Dolar");
        switch (sc.nextInt()) {
            case 1:
                generalAplications.retangulo();
                break;
            case 2:
                generalAplications.conversaoDolar();
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
    public void conversaoDolar(){
        double dolarPrice, dolarQuantity;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço do dolar: ");
        dolarPrice = sc.nextDouble();
        System.out.println("Digite o valor de dolares que deseja: ");
        dolarQuantity = sc.nextDouble();        
        System.out.printf("Total a pagar: R$%.2f", CurrencyConvertor.convertDolarToReais(dolarPrice, dolarQuantity));
        sc.close();
    }    
}
