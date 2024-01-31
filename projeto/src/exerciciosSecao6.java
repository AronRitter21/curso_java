import java.util.Scanner;

public class exerciciosSecao6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inY, alcool, gasolina, diesel;
        inY = alcool = gasolina = diesel = 0;
        while (inY != 4) {
            inY = sc.nextInt();
            switch (inY) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("Muito Obrigado!");
                    break;
                default:
                    System.out.println("Número inválido, digite outro.");
                    break;
            }
        }
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}