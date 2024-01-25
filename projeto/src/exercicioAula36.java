import java.util.Locale;
import java.util.Scanner;

public class exercicioAula36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imposto;

        Locale.setDefault(Locale.US);
        System.out.printf("Digite seu salário: ");
        double salario = sc.nextDouble();
        if (salario <= 2000.00){
            System.out.printf("O salário de R$ %.2f é isento de impostos.", salario);
        }else{
            if(salario <= 3000.00){
                imposto = (salario - 2000.00) * 0.08 ;
                System.out.printf("O salário de R$ %.2f entra na faixa de 8%%, logo o total a pagar é R$ %.2f", salario, imposto);
            }else{
                if(salario <= 4500.00){
                    imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
                    System.out.printf("O salário de R$ %.2f entra na faixa de 18%%, logo o total a pagar é R$ %.2f", salario, imposto);
                }else{
                    imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
                    System.out.printf("O salário de R$ %.2f entra na faixa de 28%%, logo o total a pagar é R$ %.2f", salario, imposto);  
                }
            }
        }
        sc.close();
    }
}
