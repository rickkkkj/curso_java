package s08.exercicios.exfixacao.util;

public class Dollar {
    public static double dollarToReal(double dollarPrice, double quantity) {
        double amountInReais = dollarPrice * quantity;
        double fee = amountInReais * 0.06;
        return amountInReais + fee;
    }
}
