package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(4,5);
        p.product(4, 5, 6);
        p.product(4.6, 5.6);
    }
    public static class Product {
        public int product(int x, int y) {
            return x;
        }

        public int product(int x, int y, int z) {
            return x;
        }

        public double product(double x, double y) {
            return x;
        }
    }
}