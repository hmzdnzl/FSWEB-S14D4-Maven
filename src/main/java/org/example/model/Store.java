package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("----------------------");
        }
    }
    public static void main(String[] args) {

       ProductForSale chocolate = new Chocolate("Sütlü", 20.0,"Sütlü Çikolata",true);
       ProductForSale cola = new Coke(25, "Gazlı", 45, "Gazlı içecek" );
       ProductForSale bread = new Bread("Diyet", 15,"Diyet Ekmek",true);

        ProductForSale[] products = {chocolate, cola, bread};

        Store store = new Store();
        store.listProducts(products);
    }
}