import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat us, india, china, france;
        
        us = NumberFormat.getCurrencyInstance(Locale.US);
        india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        china= NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " +  india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
