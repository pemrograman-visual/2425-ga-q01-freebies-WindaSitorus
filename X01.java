// 12S24001-FredrickAritonang
// 12S24019-Winda N.V Sitorus
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, total1, minimum, total2;

        hargabuku = 0;
        total1 = 0;
        minimum = 1000;
        do {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
            } else {
                if (minimum < hargabuku) {
                } else {
                    minimum = hargabuku;
                }
                total1 = total1 + hargabuku;
            }
        } while (hargabuku != 0);
        if (total1 >= 100) {
            total2 = total1 - minimum;
        } else {
            total2 = minimum;
        }
        System.out.println(toFixed(total1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
