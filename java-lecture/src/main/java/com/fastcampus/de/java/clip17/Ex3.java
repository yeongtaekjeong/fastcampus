package com.fastcampus.de.java.clip17;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {
    static class Sale {
        String fruitName;
        int price;
        float discount;

        public Sale(String fruitName, int price, float discount) {
            this.fruitName = fruitName;
            this.price = price;
            this.discount = discount;
        }
    }
    public static void main(String[] args) {
        List<Sale> saleList = Arrays.asList(
                new Sale("Apple",5000,0.05f),
                new Sale("Apple",5000,0.05f),
                new Sale("Orange",4000,0.02f),
                new Sale("Tengerine",2000,0f)

        );

        Stream<Sale> saleStream = saleList.stream();
        saleStream.map(sale -> Pair.of(sale.fruitName, sale.price*(1-sale.discount) ))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실 구매가 : "+ pair.getRight()));
    }
}
