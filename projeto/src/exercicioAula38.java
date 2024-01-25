public class exercicioAula38 {
    public static void main(String[] args) {
        int x = 9;

        switch (x) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            default:
                System.out.println("Outro");
                break;
        }

        // Expressão condicional TERNÁRIA
        double preco = 35.50;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
        System.out.println(desconto);
    }
}
