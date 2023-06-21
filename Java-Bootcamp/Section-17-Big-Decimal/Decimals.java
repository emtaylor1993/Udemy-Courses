import java.math.BigDecimal;

public class Decimals {
    public static void main(String[] args) {
        double x = 0.1;

        System.out.println(x);

        double y = 0.2;
        double z = x + y;
        
        System.out.println(z);

        BigDecimal a = new BigDecimal("0.1");
        System.out.println(a);

        BigDecimal b = new BigDecimal("0.2");
        System.out.println(a.add(b));
    }
}