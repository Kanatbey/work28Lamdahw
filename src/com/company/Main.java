package com.company;
import java.util.function.UnaryOperator;

public class Main {


    public static void main(String[] args) {
        System.out.println(sqrt().apply(8.0));
    }
    public static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> sqrt = Math::sqrt;
        return sqrt;
    }
}
//    sqrt деген метод тузунуз.
//        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
//
//public static UnaryOperator<Double> sqrt().