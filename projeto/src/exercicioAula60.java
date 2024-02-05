import java.util.Scanner;

public class exercicioAula60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o 1° valor: ");
        int valorUm = scan.nextInt();
        System.out.print("Digite o 2° valor: ");
        int valorDois = scan.nextInt();
        System.out.print("Digite o 3° valor: ");
        int valorTres = scan.nextInt();

        maior(valorUm, valorDois, valorTres);
        int valMax = maiorValor(valorUm, valorDois, valorTres);
        System.out.println("O maior valor de TODOS é " + valMax);
        scan.close();
    }

    public static int maiorValor(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > c){
            return b;
        }else{
            return c;
        }
    }
    
    public static void maior(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("O 1° valor é o maior");
        }else if(b > c){
            System.out.println("O 2° valor é o maior");
        }else{
            System.out.println("O 3° valor é o maior");
        }
    }
}
