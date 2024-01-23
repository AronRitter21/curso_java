import java.util.Scanner;

public class exercicioAula27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        
        // A recebe a raiz de valor digitado
        a = Math.sqrt(sc.nextInt());
        System.out.println(a);
        
        // B recebe valor elevado do primeiro digitado pelo segundo digitado
        b = Math.pow(sc.nextInt(), sc.nextInt());
        System.out.println(b);
        
        // C recebe o valor absoluto digitado
        c = Math.abs(sc.nextInt());
        System.out.println(c);

        sc.close();
    }
}
