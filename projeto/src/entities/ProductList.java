package entities;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ProductList {
    public TreeMap<Integer, Product> listaProdutos = new TreeMap<Integer, Product>();

    public ArrayList<String> returnListString(){
        ArrayList<String> listaProdutosString = new ArrayList<String>();
        for(Map.Entry<Integer, Product> produto : listaProdutos.entrySet()){
            listaProdutosString.add("Código: " + produto.getKey() + " " + produto.getValue().getDescricaoCompleta());
        }
        return listaProdutosString;
    }
}
