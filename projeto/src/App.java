import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        int maria = 1;
        double var1 = 12.698;
        System.out.println(maria);
        System.out.println("Ola mundo!");
        System.out.println("Hello, World!");
        System.out.printf("%.2f sasas", var1);
        Locale.setDefault(Locale.CHINA);
        System.out.printf("%.2f%n", var1);
    }
}
