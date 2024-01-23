import java.util.Scanner;

public class exerciciosSecao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.printf("1° Valor: ");
        a = sc.nextDouble();
        System.out.printf("%n2° Valor: ");
        b = sc.nextDouble();
        c = a + b;
        System.out.printf("%nA Soma dos valor é = %.2f", c);
        areaCirculo(c);
        sc.close();
    }

    private static void areaCirculo(double raio){
        double area;
        area =  3.14159 * Math.pow(raio, 2);
        System.out.printf("%n%nUm circulo com o raio de %.3f tem área = %.3f", raio, area);

    }

}
