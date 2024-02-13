package Main;

import conversion.CurrencyConverter;
import math.Calculator;
import oop.Product;

public class Main {

    public static void main (String[]args) {

        Calculator math = new Calculator();
        math.NumberSum(13);
        math.TablaInmultirii(8);
        System.out.println(math.Sum(14, 18, 70));

        CurrencyConverter conv = new CurrencyConverter();
        System.out.println(conv.EurtoMdl(19.5, 20));
        System.out.println(conv.MdltoEur(100, 19.5));

        Product prod = new Product(1);
        prod.setName("Laptop");
        prod.setPrice(10.5);

        Product prod2 = new Product(2);
        prod.setName("Smartphone");
        prod.setPrice(45.5);


    }
}
