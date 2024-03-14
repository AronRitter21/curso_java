package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.ProductList;

public class ProductAplication {
    ProductList listaProdutos = new ProductList();
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductAplication instance = new ProductAplication();
        Locale.setDefault(Locale.US);
        int acaoUsuario = 0;

        do{
            System.out.println("======================================");
            System.out.println("        O que deseja fazer?           ");
            System.out.println(" 1 - Cadastrar produto                ");
            System.out.println(" 2 - Listar produtos                  ");
            System.out.println(" 3 - Valor total do produto           ");
            System.out.println(" 4 - Adicionar quantidade             ");
            System.out.println(" 5 - Subtrair quantidade              ");
            System.out.println(" 6 - Sair                             ");
            acaoUsuario = sc.nextInt();

            switch (acaoUsuario) {
                case 1:
                    instance.cadastraProduto();
                    break;
                case 2:
                    instance.listarProduto();
                    break;
                case 3:
                    instance.valorTotal();
                    break;
                case 4:
                    instance.adicionaQuantidade();
                    break;
                case 5:
                    instance.subtraiQuantidade();
                    break;
            }
        }while(acaoUsuario != 6);

        sc.close();
    }

    public void cadastraProduto(){
        int codigo;
        String name;
        double price = 0.00;
        int quantity = 0;

        System.out.print("Digite o código do produto....: ");
        codigo = sc.nextInt();
        System.out.print("\nDigite o nome do produto......: ");
        name = sc.next();
        System.out.print("\nDigite o preço do produto.....: ");
        price = sc.nextDouble();
        System.out.print("\nDigite a quantidade do produto: ");
        quantity = sc.nextInt();
        
        listaProdutos.listaProdutos.put(codigo, new Product(name, price, quantity));
    }

    public void listarProduto(){
        for(String produto : listaProdutos.returnListString()){
            System.out.println(produto);
        }   
    }

    public void valorTotal(){
        int codigo;
        
        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        Product product = listaProdutos.listaProdutos.get(codigo);
        System.out.println("Valor total em estoque do item " + product.getName() + " é de R$" + product.totalValueInStock());
    }
    
    public void adicionaQuantidade(){
        int codigo;
        int quantidade;
        
        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade a adicionar: ");
        quantidade = sc.nextInt();
        Product product = listaProdutos.listaProdutos.get(codigo);
        product.addProducts(quantidade);
        listaProdutos.listaProdutos.put(codigo, product);
        System.out.println("Quantidade total em estoque do item " + product.getName() + " é de " + product.getQuantity() + " un.");
    }
    
    public void subtraiQuantidade(){
        int codigo;
        int quantidade;
        
        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade a subtrair: ");
        quantidade = sc.nextInt();
        Product product = listaProdutos.listaProdutos.get(codigo);
        product.removeProducts(quantidade);
        listaProdutos.listaProdutos.put(codigo, product);
        System.out.println("Quantidade total em estoque do item " + product.getName() + " é de " + product.getQuantity() + " un.");
    }
}
