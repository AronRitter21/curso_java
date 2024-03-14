package entities;

public class Product {
    private String productName;
    private double productPrice = 0.00;
    private int productQuantity = 0;


    public Product(String productName, double productPrice, int productQuantity){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    
    
    public String getName(){
        return productName;
    }

    public int getQuantity(){
        return productQuantity;
    }
    
    public double totalValueInStock(){
        return productQuantity * productPrice;
    }

    public void addProducts(int quantity){
        productQuantity += quantity;
    }

    public void removeProducts(int quantity){
        productQuantity -= quantity;
    }

    public String getDescricaoCompleta(){
        return "Produto: " + productName + " Preço: R$" + productPrice + " Quantidade: " + productQuantity;
    }


}
