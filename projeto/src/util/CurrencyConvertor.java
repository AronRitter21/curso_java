package util;

public class CurrencyConvertor {
// IOF sobre a conversão
    public static final double IOF = 1.06;

// Calcula a quantidade a ser paga em reais para se obter certa quantidade de dolares
    public static double convertDolarToReais(double dolarPrice, double dolarQuantity){
        return dolarPrice * IOF * dolarQuantity;
    }
}
