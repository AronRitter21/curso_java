import java.util.Scanner;

public class exercicioAula44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y = 0;
        //x = sc.nextInt();
        while (y < 50) {
            x = sc.nextInt();
            y += x;
            System.out.println("Valor de Y: " + y);

        }
        sc.close();
    }
}