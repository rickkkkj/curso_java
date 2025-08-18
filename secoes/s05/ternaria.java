package s05;

public class ternaria {
    public static void main(String[] args) {
        double v = 31;
        double preco = (v < 20) ? v * 0.01 : v * 0.05;
        System.out.println(preco);
    }
}
