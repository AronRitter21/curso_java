import java.util.Scanner;

public class exercicioAula25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        String y,z,a;
        System.out.print("Digite: ");
        x = sc.nextInt();

        System.out.println("Digitou: " + x);
        sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();
        a = sc.nextLine();
        
        System.out.printf("%s%n%s%n%s%n",y,z,a);
        sc.close();
    }
}