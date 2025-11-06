package org.example.model;

public class Bread extends ProductForSale {

    private boolean isDiet;

    public Bread(boolean isDiet) {
        this.isDiet = isDiet;
    }

    public Bread(String type, int price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }


    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.isDiet = false; // Varsayılan değer
    }

    @Override
    public void showDetails() {
        System.out.println("Tür: " + getType());
        System.out.println("Fiyat: " + getPrice());
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Diyete uygun mu: " + isDiet);
    }
}