package associativeArrays.exercise;

import java.util.*;

public class P03Orders {
    static class Product {
        private double price;
        private int quantity;

        public Product (double price, int quantity){
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return this.price;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();

        Map<String, Product> productsMap = new LinkedHashMap<>();

        while (!lineInput.equals("buy")) {
            String product = lineInput.split(" ")[0];
            double price = Double.parseDouble(lineInput.split(" ")[1]);
            int quantity = Integer.parseInt(lineInput.split(" ")[2]);
            if (!productsMap.containsKey(product)) {
                productsMap.put(product, new Product(price, quantity));
            } else {
                Product currentProductData = productsMap.get(product);
                if (currentProductData.getPrice() != price) {
                    currentProductData.setPrice(price);
                }
                currentProductData.setQuantity(currentProductData.getQuantity() + quantity);

                }

            lineInput = scan.nextLine();
            }

        productsMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> %.2f%n",
                    entry.getKey(), entry.getValue().getQuantity() * entry.getValue().getPrice());
        });
        }
    }

